# net.wikipunk/framebase
FrameBase is a linked open knowledge base meant to uniformly
represent a wide range of knowledge, tackling semantic heterogeneity
among various sources of structured knowledge, such as the ones in
the Linked Open Data cloud. It provides a flexible and uniform way of
capturing n-ary relationships by adapting and combining repositories
of frames from the fields of linguistics and cognitive science
(FrameNet and WordNet) to establish a large and wide-coverage
vocabulary that can be used to represent complex knowledge and
extended with more specific elements. In other words: if you can
express it with language, you can express it with FrameBase —barring
some very specific concepts that need to be coined or imported from
domain-specific KBs. 

## :rdfs/seeAlso
* https://www.framebase.org/about

## :dev

``` shell
clojure -A:dev
```

``` clojure
(reset)
```

``` clojure
;; Example Frame
(def Synset00023271.cognition.noun
  "the psychological result of perception and learning and reasoning"
  {:db/ident :fbframe/Synset00023271.cognition.noun,
   :fbmeta/hasDefinition
   {:rdf/language "en",
    :rdf/value
    "the psychological result of perception and learning and reasoning"},
   :fbmeta/hasLexicalForm [{:rdf/language "en",
                            :rdf/value    "noesis"}
                           {:rdf/language "en",
                            :rdf/value    "cognition"}
                           {:rdf/language "en",
                            :rdf/value    "knowledge"}],
   :fbmeta/hasSynsetNumber 23271,
   :fbmeta/inheritsFrom :fbframe/Top_frame,
   :rdf/type [:fbmeta/Microframe
              :fbmeta/SynsetMicroframe
              :fbmeta/Miniframe
              :fbmeta/Macroframe
              :rdfs/Class
              :fbmeta/Frame
              :rdfs/Resource],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "the psychological result of perception and learning and reasoning"},
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "cognition"}
                {:rdf/language "en",
                 :rdf/value    "knowledge"}
                {:rdf/language "en",
                 :rdf/value    "noesis"}],
   :rdfs/subClassOf
   [:fbframe/Synset00023271.cognition.noun :rdfs/Resource :fbframe/Top_frame]})
```

``` clojure
;; Example Frame element property
(def Cognitive_connection.has_concepts
  "The two concepts expressed jointly."
  {:db/ident :fbfe/Cognitive_connection.has_concepts,
   :fbmeta/hasDefinition {:rdf/language "en",
                          :rdf/value    "The two concepts expressed jointly."},
   :fbmeta/hasFramenetFE {:rdf/language "en",
                          :rdf/value    "Concepts"},
   :fbmeta/hasFramenetFrame {:rdf/language "en",
                             :rdf/value    "Cognitive_connection"},
   :fbmeta/hasLexicalForm {:rdf/language "en",
                           :rdf/value    "Concepts"},
   :rdf/type [:fbfe/Top_frame.has_element :rdf/Property :rdfs/Resource],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The two concepts expressed jointly."},
   :rdfs/domain :fbframe/Cognitive_connection,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concepts"},
   :rdfs/subPropertyOf [:fbfe/Cognitive_connection.has_concepts
                        :fbfe/Top_frame.has_concepts]})
```

``` clojure
;; Example direct binary predicate property
(def Awareness.gainsCognitionAboutTopic
  "gains/VBZ cognition/NN about/IN (NP Topic)"
  {:db/ident :fbdbp/Awareness.gainsCognitionAboutTopic,
   :fbmeta/hasLexicalForm {:rdf/language "en",
                           :rdf/value    "gains cognition about topic"},
   :fbmeta/hasSyntacticallyAnnotatedLexicalLabel
   "gains/VBZ cognition/NN about/IN (NP Topic)",
   :fbmeta/hasTraces
   "[<<prep0>>, <<N dobj-1 V>>, <<agent-verb-particle-NOUN-pp>>]",
   :fbmeta/isCreatedFromNumberOfFramenetAnnotatedSentences "2.04",
   :fbmeta/isExtendedRule true,
   :fbmeta/isOriginalRule false,
   :rdf/type [:rdfs/Resource :fbmeta/DirectBinaryPredicateClass :rdf/Property],
   :rdfs/comment "gains/VBZ cognition/NN about/IN (NP Topic)",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gains cognition about topic"}})
```

## License
Copyright (c) 2023 Adrian Medina

Permission to use, copy, modify, and/or distribute this software for
any purpose with or without fee is hereby granted, provided that the
above copyright notice and this permission notice appear in all
copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
