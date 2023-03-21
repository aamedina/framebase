(ns net.wikipunk.framebase
  (:require
   [com.stuartsierra.component :as com]
   [datomic.client.api :as d]))

(defrecord FrameBase [fbframe fbfe fbdbp]
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))
