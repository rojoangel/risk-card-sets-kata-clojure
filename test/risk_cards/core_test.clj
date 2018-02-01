(ns risk-cards.core-test
  (:require [clojure.test :refer :all]
            [risk-cards.core :as card-set]))

(deftest valid-sets
  (testing "A valid collection of cards set should"
    (testing "contain only cards with the same symbol"
      (is (= true (card-set/valid? [\H \H \H])))
      (is (= false (card-set/valid? [\H \H \C]))))
    (testing "contain cards with all symbols different"
      (is (= true (card-set/valid? [\C \S \H]))))
    (testing "contain cards with the same symbol and jokers"
      (is (= true (card-set/valid? [\H \H \J]))))
    (testing "contain cards with all symbols different and jokers"
      (is (= true (card-set/valid? [\C \S \J]))))))


