(ns net.wikipunk.rdf.fbmeta
  "This ontology describes the meta-model of FrameBase."
  {:dcat/downloadURL "resources/FrameBase_metaschema.ttl",
   :rdf/ns-prefix-map {"db" "https://wikipunk.net/db/",
                       "db.cardinality" "https://wikipunk.net/db/cardinality/",
                       "db.type" "https://wikipunk.net/db/type/",
                       "db.unique" "https://wikipunk.net/db/unique/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "fbdbp" "http://framebase.org/fbdbp/",
                       "fbfe" "http://framebase.org/fbfe/",
                       "fbframe" "http://framebase.org/frame/",
                       "fbmeta" "http://framebase.org/meta/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fbmeta",
   :rdfa/uri "http://framebase.org/meta/",
   :rdfs/comment #voc/lstr
                  "This ontology describes the meta-model of FrameBase.@en",
   :rdfs/label #voc/lstr "FrameBase Meta Ontology@en"})

(def DirectBinaryPredicateClass
  "Class of all Direct Binary Predicates."
  {:db/ident        :fbmeta/DirectBinaryPredicateClass,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Class of all Direct Binary Predicates.@en",
   :rdfs/label      #voc/lstr "DirectBinaryPredicateClass@en",
   :rdfs/subClassOf [:rdfs/Resource :fbmeta/MetaClassClass :rdf/Property]})

(def Frame
  "Class of all frames: macroframes, miniframes and microframes."
  {:db/ident :fbmeta/Frame,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "Class of all frames: macroframes, miniframes and microframes.@en",
   :rdfs/label #voc/lstr "Frame@en",
   :rdfs/subClassOf :rdfs/Resource})

(def FrameElementPropertyClass
  "Class of all Frame Element properties."
  {:db/ident        :fbmeta/FrameElementPropertyClass,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Class of all Frame Element properties.@en",
   :rdfs/label      #voc/lstr "FrameElementPropertyClass@en",
   :rdfs/subClassOf [:rdfs/Resource :rdf/Property]})

(def LuMicroframe
  "Class of all microframes extracted from FrameNet's Lexical Units."
  {:db/ident :fbmeta/LuMicroframe,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Class of all microframes extracted from FrameNet's Lexical Units.@en",
   :rdfs/subClassOf [:rdfs/Resource
                     :fbmeta/MetaClassClass
                     :fbmeta/Microframe
                     :fbmeta/Miniframe
                     :fbmeta/Macroframe]})

(def Macroframe
  "Class of all macroframes. They have very general broad meanings."
  {:db/ident :fbmeta/Macroframe,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Class of all macroframes. They have very general broad meanings.@en",
   :rdfs/label #voc/lstr "Macroframe@en",
   :rdfs/subClassOf :rdfs/Resource})

(def MetaClassClass
  "Class of all FrameBase meta-classes."
  {:db/ident     :fbmeta/MetaClassClass,
   :rdf/type     :owl/Class,
   :rdfs/comment #voc/lstr "Class of all FrameBase meta-classes.@en",
   :rdfs/label   #voc/lstr "MetaClassClass@en"})

(def MetaPropertyClass
  "Class of all FrameBase meta-properties."
  {:db/ident        :fbmeta/MetaPropertyClass,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "Class of all FrameBase meta-properties.@en",
   :rdfs/label      #voc/lstr "MetaPropertyClass@en",
   :rdfs/subClassOf [:rdfs/Resource :fbmeta/MetaClassClass]})

(def Microframe
  "Class of all microframes. Very specific meanings."
  {:db/ident        :fbmeta/Microframe,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr
                     "Class of all microframes. Very specific meanings.@en",
   :rdfs/label      #voc/lstr "Microframe@en",
   :rdfs/subClassOf [:rdfs/Resource :fbmeta/Miniframe :fbmeta/Macroframe]})

(def Miniframe
  "Class of all miniframes, grouping microframes that belong to a same clique of :similarTo"
  {:db/ident :fbmeta/Miniframe,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Class of all miniframes, grouping microframes that belong to a same clique of :similarTo@en",
   :rdfs/label #voc/lstr "Miniframe@en",
   :rdfs/subClassOf [:rdfs/Resource :fbmeta/Macroframe]})

(def SynsetMicroframe
  "Class of all microframes extracted from WordNet's Synsets."
  {:db/ident :fbmeta/SynsetMicroframe,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "Class of all microframes extracted from WordNet's Synsets.@en",
   :rdfs/label #voc/lstr "SynsetMicroframe@en",
   :rdfs/subClassOf
   [:rdfs/Resource :fbmeta/Microframe :fbmeta/Miniframe :fbmeta/Macroframe]})

(def hasDefinition
  "This property links a FrameBase frame to its definition."
  {:db/cardinality :db.cardinality/many,
   :db/ident :fbmeta/hasDefinition,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "This property links a FrameBase frame to its definition.@en",
   :rdfs/label #voc/lstr "hasDefinition@en",
   :rdfs/subPropertyOf :rdfs/comment})

(def hasFramenetFE
  "hasFramenetFE"
  {:db/cardinality :db.cardinality/one,
   :db/fulltext    true,
   :db/ident       :fbmeta/hasFramenetFE,
   :db/valueType   :db.type/string,
   :rdf/type       :rdf/Property,
   :rdfs/label     #voc/lstr "hasFramenetFE@en",
   :rdfs/range     :rdfs/Literal})

(def hasFramenetFrame
  "This property links a FrameBase frame to a FrameNet frame."
  {:db/cardinality :db.cardinality/one,
   :db/fulltext true,
   :db/ident :fbmeta/hasFramenetFrame,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "This property links a FrameBase frame to a FrameNet frame.@en",
   :rdfs/label #voc/lstr "hasFramenetFrame@en",
   :rdfs/range :xsd/string})

(def hasFramenetLU
  "This property links a FrameBase frame to a FrameNet lexical unit."
  {:db/cardinality :db.cardinality/many,
   :db/fulltext true,
   :db/ident :fbmeta/hasFramenetLU,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "This property links a FrameBase frame to a FrameNet lexical unit.@en",
   :rdfs/label #voc/lstr "hasFramenetLU@en",
   :rdfs/range :xsd/string})

(def hasLexicalForm
  "This property links a FrameBase lexical unit to its lexical form."
  {:db/cardinality :db.cardinality/many,
   :db/fulltext true,
   :db/ident :fbmeta/hasLexicalForm,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "This property links a FrameBase lexical unit to its lexical form.@en",
   :rdfs/label #voc/lstr "hasLexicalForm@en",
   :rdfs/range :xsd/string})

(def hasSynsetNumber
  "This property links a FrameBase frame to its synset number."
  {:db/cardinality :db.cardinality/one,
   :db/ident :fbmeta/hasSynsetNumber,
   :db/valueType :db.type/long,
   :rdf/type :rdfs/Property,
   :rdfs/comment
   #voc/lstr "This property links a FrameBase frame to its synset number.@en",
   :rdfs/label #voc/lstr "hasSynsetNumber@en",
   :rdfs/range :xsd/integer})

(def hasSyntacticallyAnnotatedLexicalLabel
  "Annotation of part-of-speech and some phrase structure, using Penn notation"
  {:db/cardinality :db.cardinality/many,
   :db/fulltext true,
   :db/ident :fbmeta/hasSyntacticallyAnnotatedLexicalLabel,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Annotation of part-of-speech and some phrase structure, using Penn notation@en",
   :rdfs/label #voc/lstr "hasSyntacticallyAnnotatedLexicalLabel@en",
   :rdfs/subPropertyOf :rdfs/comment})

(def hasTraces
  "hasTraces"
  {:db/cardinality :db.cardinality/one,
   :db/fulltext    true,
   :db/ident       :fbmeta/hasTraces,
   :db/valueType   :db.type/string,
   :rdf/type       :rdf/Property,
   :rdfs/label     #voc/lstr "hasTraces@en",
   :rdfs/range     :rdfs/Literal})

(def inheritsFrom
  "This property links a FrameBase frame to its parent frame."
  {:db/cardinality :db.cardinality/many,
   :db/ident :fbmeta/inheritsFrom,
   :db/valueType :db.type/ref,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "This property links a FrameBase frame to its parent frame.@en",
   :rdfs/label #voc/lstr "inheritsFrom@en",
   :rdfs/subPropertyOf :rdfs/subClassOf})

(def isCreatedFromNumberOfFramenetAnnotatedSentences
  "Number of sentences annotated in FrameNet that were used to create this frame."
  {:db/cardinality :db.cardinality/one,
   :db/ident :fbmeta/isCreatedFromNumberOfFramenetAnnotatedSentences,
   :db/valueType :db.type/string,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Number of sentences annotated in FrameNet that were used to create this frame.@en",
   :rdfs/label #voc/lstr "isCreatedFromNumberOfFramenetAnnotatedSentences@en",
   :rdfs/range :xsd/integer})

(def isExtendedRule
  "Has been created extending synonyms."
  {:db/cardinality :db.cardinality/one,
   :db/ident       :fbmeta/isExtendedRule,
   :db/valueType   :db.type/boolean,
   :rdf/type       :rdfs/Property,
   :rdfs/comment   #voc/lstr "Has been created extending synonyms.@en",
   :rdfs/label     #voc/lstr "isExtendedRule@en",
   :rdfs/range     :xsd/boolean})

(def isOriginalRule
  "This property indicates whether a rule is original or not."
  {:db/cardinality :db.cardinality/one,
   :db/ident :fbmeta/isOriginalRule,
   :db/valueType :db.type/boolean,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "This property indicates whether a rule is original or not.@en",
   :rdfs/label #voc/lstr "isOriginalRule@en",
   :rdfs/range :xsd/boolean})

(def isPerspectiveOf
  "This property connects a frame to another that is a perspective of it."
  {:db/cardinality :db.cardinality/many,
   :db/ident :fbmeta/isPerspectiveOf,
   :db/valueType :db.type/ref,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "This property connects a frame to another that is a perspective of it.@en",
   :rdfs/label #voc/lstr "isPerspectiveOf@en",
   :rdfs/subPropertyOf :rdfs/subClassOf})

(def isSimilarTo
  "This property connects microframes from a given cluster of near-synonyms."
  {:db/cardinality :db.cardinality/many,
   :db/ident :fbmeta/isSimilarTo,
   :db/valueType :db.type/ref,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "This property connects microframes from a given cluster of near-synonyms.@en",
   :rdfs/domain :fbmeta/Microframe,
   :rdfs/label #voc/lstr "isSimilarTo@en",
   :rdfs/range :fbmeta/Microframe})