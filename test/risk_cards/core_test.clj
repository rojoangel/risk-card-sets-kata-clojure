(ns risk-cards.core-test
  (:require [clojure.test :refer :all]
            [risk-cards.core :as card-set]))

(deftest valid-sets
  (testing "A valid collection of cards set should"
    (testing "contain only cards with the same symbol"
      (is (= true (card-set/valid? [\H \H \H]))))))

