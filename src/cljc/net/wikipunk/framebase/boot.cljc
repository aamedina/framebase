(ns net.wikipunk.framebase.boot
  {:rdf/type :jsonld/Context})

(def fbframe
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_schema_core.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://framebase.org/frame/"
   :rdfa/prefix      "fbframe"})

(def fbfe
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_schema_core.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://framebase.org/fe/"
   :rdfa/prefix      "fbfe"})

(def fbmeta
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_metaschema.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://framebase.org/meta/"
   :rdfa/prefix      "fbmeta"})

(def fbdbp
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_schema_dbps.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://framebase.org/dbp/"
   :rdfa/prefix      "fbdbp"})

#_(def fblexicon
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_schema_lemon_annotations.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://framebase.org/lexicon/en/"
   :rdfa/prefix      "fblexicon"})

#_(def wn30
  {:dcat/downloadURL "https://www.framebase.org/files/data/dump/schema/FrameBase_schema_wordnet_30_links.ttl.gz"})
