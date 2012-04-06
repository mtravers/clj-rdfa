(defproject
  rdfa "0.5.0-SNAPSHOT"
  :description "A Clojure library for extracting triples from RDFa 1.1 in XML/XHTML/HTML"
  :url "https://github.com/niklasl/clj-rdfa"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 ;[nu.validator.htmlparser/htmlparser "1.2.1"]
                 [net.sourceforge.nekohtml/nekohtml "1.9.15"]]
  :dev-dependencies [[midje "1.3.2-SNAPSHOT"]
                     [lein-midje "1.0.9"]
                     [com.stuartsierra/lazytest "1.2.3"]
                     [lein-marginalia "0.6.0"]
                     [vimclojure/server "2.3.1"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"}
  :target-dir "target"
  :jar-exclusions [#"(?:^|/)\..+"]
  :main rdfa.cli)
