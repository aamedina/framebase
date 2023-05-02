(ns net.wikipunk.rdf.fbmeta
  "http://framebase.org/meta/"
  {:rdf/ns-prefix-map {"fbmeta" "http://framebase.org/meta/"
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#"
                       "owl"    "http://www.w3.org/2002/07/owl#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "fbmeta",
   :rdfa/uri          "http://framebase.org/meta/"})

(def DirectBinaryPredicateClass
  "Class of all Direct Binary Predicates."
  {:db/ident        :fbmeta/DirectBinaryPredicateClass,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Class of all Direct Binary Predicates."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "DirectBinaryPredicateClass"},
   :rdfs/subClassOf :rdf/Property})

(def Frame
  "Class of all frames: macroframes, miniframes and microframes."
  {:db/ident   :fbmeta/Frame,
   :rdf/type   :fbmeta/MetaClassClass,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value    "Class of all frames: macroframes, miniframes and microframes."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Frame"}})

(def FrameElementPropertyClass
  "Class of all Frame Element properties."
  {:db/ident        :fbmeta/FrameElementPropertyClass,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Class of all Frame Element properties."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "FrameElementPropertyClass"},
   :rdfs/subClassOf :rdf/Property})

(def LuMicroframe
  "Class of all microframes extracted from FrameNet's Lexical Units."
  {:db/ident        :fbmeta/LuMicroframe,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Class of all microframes extracted from FrameNet's Lexical Units."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "LuMicroframe"},
   :rdfs/subClassOf :fbmeta/Microframe})

(def Macroframe
  "Class of all macroframes. They have very general broad meanings."
  {:db/ident        :fbmeta/Macroframe,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Class of all macroframes. They have very general broad meanings."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Macroframe"},
   :rdfs/subClassOf :fbmeta/Frame})

(def MetaClassClass
  "Class of all FrameBase meta-classes."
  {:db/ident     :fbmeta/MetaClassClass,
   :rdf/type     [:fbmeta/MetaClassClass :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Class of all FrameBase meta-classes."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "MetaClassClass"}})

(def MetaPropertyClass
  "Class of all FrameBase meta-properties."
  {:db/ident     :fbmeta/MetaPropertyClass,
   :rdf/type     [:fbmeta/MetaClassClass :rdfs/Class],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Class of all FrameBase meta-properties."},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "MetaPropertyClass"}})

(def Microframe
  "Class of all microframes. Very specific meanings."
  {:db/ident        :fbmeta/Microframe,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Class of all microframes. Very specific meanings."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Microframe"},
   :rdfs/subClassOf :fbmeta/Miniframe})

(def Miniframe
  "Class of all miniframes, grouping microframes that belong to a same clique of :similarTo"
  {:db/ident        :fbmeta/Miniframe,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Class of all miniframes, grouping microframes that belong to a same clique of :similarTo"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Miniframe"},
   :rdfs/subClassOf :fbmeta/Macroframe})

(def SynsetMicroframe
  "Class of all microframes extracted from WordNet's Synsets."
  {:db/ident        :fbmeta/SynsetMicroframe,
   :rdf/type        :fbmeta/MetaClassClass,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Class of all microframes extracted from WordNet's Synsets."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "SynsetMicroframe"},
   :rdfs/subClassOf :fbmeta/Microframe})

(def hasDefinition
  ""
  {:db/ident           :fbmeta/hasDefinition,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/string
   :rdf/type           :fbmeta/MetaPropertyClass,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    ""},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hasDefinition"},
   :rdfs/subPropertyOf :rdfs/comment})

(def hasFramenetFE
  "hasFramenetFE"
  {:db/ident       :fbmeta/hasFramenetFE,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/string
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "hasFramenetFE"},
   :rdfs/range     :rdfs/Literal})

(def hasFramenetFrame
  "hasFramenetFrame"
  {:db/ident       :fbmeta/hasFramenetFrame,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/string
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "hasFramenetFrame"},
   :rdfs/range     :rdfs/Literal})

(def hasFramenetLU
  "hasFramenetLU"
  {:db/ident       :fbmeta/hasFramenetLU,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/string
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "hasFramenetLU"},
   :rdfs/range     :rdfs/Literal})

(def hasLexicalForm
  ""
  {:db/ident           :fbmeta/hasLexicalForm,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/string
   :rdf/type           :fbmeta/MetaPropertyClass,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    ""},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hasLexicalForm"},
   :rdfs/subPropertyOf :rdfs/label})

(def hasSynsetNumber
  ""
  {:db/ident       :fbmeta/hasSynsetNumber,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/long
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    ""},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "hasSynsetNumber"},
   :rdfs/range     :xsd/integer})

(def hasSyntacticallyAnnotatedLexicalLabel
  "Annotation of part-of-speech and some phrase structure, using Penn notation"
  {:db/ident           :fbmeta/hasSyntacticallyAnnotatedLexicalLabel,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/string
   :rdf/type           :fbmeta/MetaPropertyClass,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Annotation of part-of-speech and some phrase structure, using Penn notation"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "hasSyntacticallyAnnotatedLexicalLabel"},
   :rdfs/subPropertyOf :rdfs/comment})

(def hasTraces
  ""
  {:db/ident       :fbmeta/hasTraces,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/string
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    ""},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "hasTraces"},
   :rdfs/range     :rdfs/Literal})

(def inheritsFrom
  ""
  {:db/ident           :fbmeta/inheritsFrom,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/ref
   :rdf/type           :fbmeta/MetaPropertyClass,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    ""},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "inheritsFrom"},
   :rdfs/subPropertyOf :rdfs/subClassOf})

(def isCreatedFromNumberOfFramenetAnnotatedSentences
  ""
  {:db/ident       :fbmeta/isCreatedFromNumberOfFramenetAnnotatedSentences,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/string
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    ""},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "isCreatedFromNumberOfFramenetAnnotatedSentences"},
   :rdfs/range     :xsd/integer})

(def isExtendedRule
  "Has been created extending synonyms."
  {:db/ident       :fbmeta/isExtendedRule,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/boolean
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    "Has been created extending synonyms."},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "isExtendedRule"},
   :rdfs/range     :xsd/boolean})

(def isOriginalRule
  ""
  {:db/ident       :fbmeta/isOriginalRule,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/boolean
   :rdf/type       :fbmeta/MetaPropertyClass,
   :rdfs/comment   {:rdf/language "en",
                    :rdf/value    ""},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "isOriginalRule"},
   :rdfs/range     :xsd/boolean})

(def isPerspectiveOf
  ""
  {:db/ident           :fbmeta/isPerspectiveOf,
   :db/cardinality     :db.cardinality/many
   :db/valueType       :db.type/ref
   :rdf/type           :fbmeta/MetaPropertyClass,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    ""},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "isPerspectiveOf"},
   :rdfs/subPropertyOf :rdfs/subClassOf})

(def isSimilarTo
  "This property connects microframes from a given cluster of near-synonyms."
  {:db/ident       :fbmeta/isSimilarTo,
   :db/cardinality :db.cardinality/many
   :db/valueType   :db.type/ref
   :rdf/type
   [:fbmeta/MetaPropertyClass :owl/SymmetricProperty :owl/TransitiveProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property connects microframes from a given cluster of near-synonyms."},
   :rdfs/label     {:rdf/language "en",
                    :rdf/value    "isSimilarTo"}})
