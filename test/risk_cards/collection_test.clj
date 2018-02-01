(ns risk-cards.collection-test
  (:require [clojure.test :refer :all]
            [risk-cards.collection :as collection]))

(deftest collection-of-cards-contains-a-valid-set
  (testing "A collection of 0 cards does not contain a valid set"
    (is (= false (collection/contains-valid-set? []))))
  (testing "A collection of 1 cards does not contain a valid set"
    (is (= false (collection/contains-valid-set? [\H])))
    (is (= false (collection/contains-valid-set? [\S])))
    (is (= false (collection/contains-valid-set? [\C])))
    (is (= false (collection/contains-valid-set? [\J]))))
  (testing "A collection of 2 cards does not contain a valid set"
    (is (= false (collection/contains-valid-set? [\H \S]))))
  (testing "A collection of 3 cards should"
    (testing "contain a valid set if all cards are equal"
      (is (= true (collection/contains-valid-set? [\H \H \H]))))))
