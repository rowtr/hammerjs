(set-env!
  :resource-paths #{"src"}
  :dependencies '[[cljsjs/hammer                            "2.0.4-5"]
                  [hoplon/boot-hoplon                       "0.1.13"            :scope "test"]
                  [hoplon                                   "6.0.0-alpha16"]])

(require
  '[hoplon.boot-hoplon       :refer [hoplon prerender]])

(task-options!
  push        {:repo "clojars-upload"}
  hoplon      {:manifest true}
  pom         {:project 'rowtr/hammerjs
                :version "2.0.4-1"
                :description "hoplon hammerjs implementation" })

(deftask build-jar
 "build the jar"
 []
 (comp
   (hoplon)
   (pom)
   (jar)))

(deftask install-jar
  "install the jar"
  []
  (comp
    (build-jar)
    (install)))
