(ns net.wikipunk.framebase
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.fbmeta]))

(defrecord FrameBase [fbframe fbfe fbdbp]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))
