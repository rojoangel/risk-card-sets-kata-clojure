(ns risk-cards.collection-test
  (:require [clojure.test :refer :all]
            [risk-cards.collection :as collection]))

(deftest collection-of-cards-contains-a-valid-set
  (testing "A collection of 0 cards should"
    (testing "contain a valid set"
      (is (= false (collection/contains-valid-set? [])))))
  (testing "A collection of 1 cards should"
    (testing "not contain a valid set"
      (is (= false (collection/contains-valid-set? [\H])))
      (is (= false (collection/contains-valid-set? [\S])))
      (is (= false (collection/contains-valid-set? [\C])))
      (is (= false (collection/contains-valid-set? [\J])))))
  (testing "A collection of 2 cards"
    (testing "should not contain a valid set"
      (is (= false (collection/contains-valid-set? [\H \S])))))
  (testing "A collection of 3 cards should"
    (testing "contain a valid set if all cards are equal"
      (is (= true (collection/contains-valid-set? [\H \H \H]))))
    (testing "contain a valid set if all cards are different"
      (is (= true (collection/contains-valid-set? [\H \S \C]))))
    (testing "not contain a valid set if not all cards equal or different"
      (is (= false (collection/contains-valid-set? [\H \H \S])))))
  (testing "A collection of 4 cards should"
    (testing "be invalid if contains only two symbols"
      (is (= false (collection/contains-valid-set? [\H \H \S \S]))))
    (testing "be valid if contains jokers"
      (is (= true (collection/contains-valid-set? [\H \H \J \J]))))
    (testing "be valid otherwise"
      (is (= true (collection/contains-valid-set? [\H \C \S \S])))))
  (testing "A collection of 5+ cards should"
    (testing "contain a valid set"
      (is (= true (collection/contains-valid-set? [\H \H \J \S \C]))))))
