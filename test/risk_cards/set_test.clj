(ns risk-cards.set-test
  (:require [clojure.test :refer :all]
            [risk-cards.set :as set]))

(deftest valid-test
  (testing "A valid collection of cards set should"
    (testing "contain only cards with the same symbol"
      (is (= true (set/valid? [\H \H \H])))
      (is (= false (set/valid? [\H \H \C]))))
    (testing "contain cards with all symbols different"
      (is (= true (set/valid? [\C \S \H]))))
    (testing "contain cards with the same symbol and jokers"
      (is (= true (set/valid? [\H \H \J]))))
    (testing "contain cards with all symbols different and jokers"
      (is (= true (set/valid? [\C \S \J]))))
    (testing "contain one card and two jokers"
      (is (= true (set/valid? [\C \J \J]))))))