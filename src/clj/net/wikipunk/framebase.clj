(ns net.wikipunk.framebase
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.framebase.boot]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.fbmeta]
   #_[net.wikipunk.rdf.fbframe]
   #_[net.wikipunk.rdf.fbfe]))

(defrecord FrameBase [framebase]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))

