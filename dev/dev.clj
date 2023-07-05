(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [datomic.client.api :as d]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.mop :as mop :refer [isa? descendants parents ancestors]]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.punk.db :as db]
   [zprint.core :as zprint]
   [net.wikipunk.framebase.boot :as boot]
   [net.wikipunk.framebase :as fb]
   [xtdb.api :as xt])
  (:refer-clojure :exclude [isa? descendants parents ancestors]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  ;; Prerequisite: You need a lot of RAM. Tested with 128 GB.
  
  ;; Ensure .vocab directory does not exist in repo dir.
  ;; Also ensure that the database you are connecting to in :db has
  ;; been deleted so you can start from a tabula rasa.
  
  ;; Require the big vocabularies before starting the system.
  (require 'net.wikipunk.rdf.fbframe)
  (require 'net.wikipunk.rdf.fbfe)
  
  ;; Reset the system including the vocabulary using MOP.
  (reset)

  ;; Wait until all of the transactions have been installed into the
  ;; XTDB embedded database on disk. Check progress using something
  ;; like:
  ((juxt xt/latest-submitted-tx xt/latest-completed-tx) mop/*env*)

  ;; This might take a while--give it at least 30 minutes, there are a
  ;; lot of Frames.

  ;; Restart the REPL after it is done. Then reset the system as
  ;; normal.  
  (reset)

  ;; Bootstrap the schema without fbfe attributes but maintaining
  ;; their metaobjects and MOP relations with Frames
  (let [schema (db/bootstrap-attributes mop/*env* (remove #(= (namespace (:db/ident %)) "fbfe")))]
    (alter-var-root #'db/*schema* (constantly schema)))
  
  ;; Once you are ready create a boot-db.
  (def boot-db (db/test-bootstrap (:db system)))

  ;; Once the boot-db can be successfully created to your
  ;; satisfaction (query it!)...

  (db/bootstrap (:db system) boot-db)

  ;; If you run out of memory but are certain the database will work
  ;; before testing everything in memory, try:
  (db/bootstrap (:db system) nil)

  ;; If your :db is a Datomic Cloud database you will install the
  ;; metaobjects in the cloud. If your :db is dev-local, you will
  ;; install all of the metaobjects to a local directory on your
  ;; computer.
  )
