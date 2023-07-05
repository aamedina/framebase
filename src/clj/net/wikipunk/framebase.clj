(ns net.wikipunk.framebase
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.framebase.boot]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.punk.db :as db]
   [net.wikipunk.rdf.fbmeta]
   [net.wikipunk.rdf.event]
   #_[net.wikipunk.rdf.fbframe] 
   #_[net.wikipunk.rdf.fbfe]))

(defrecord FrameBase []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))

