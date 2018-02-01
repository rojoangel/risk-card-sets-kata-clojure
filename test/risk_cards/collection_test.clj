(ns risk-cards.collection-test
  (:require [clojure.test :refer :all]
            [risk-cards.collection :as collection]))

(deftest collection-of-cards-contains-a-valid-set
  (testing "A collection of 0 cards does not contain a valid set"
    (is (= false (collection/contains-valid-set? []))))
  (testing "A collection of 1 cards does not contain a valid set"
    (is (= false (collection/contains-valid-set? [\H])))))
