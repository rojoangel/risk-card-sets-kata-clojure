(defproject risk-cards "0.1.0-SNAPSHOT"
  :description "Risk card sets kata"
  :url "http://langrsoft.com/2017/07/17/tdd-kata-risk-card-sets/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot risk-cards.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-auto "0.1.3"]])
