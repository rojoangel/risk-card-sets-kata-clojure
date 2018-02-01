(ns risk-cards.collection
  (:require [risk-cards.set :as set]))

(defn- some-joker? [collection]
  (some set/joker? collection))

(defn- only-two-symbols? [collection]
  (= 2 (count (distinct collection))))

(defmulti contains-valid-set? count)

(defmethod contains-valid-set? 0 [_]
  false)

(defmethod contains-valid-set? 1 [_]
  false)

(defmethod contains-valid-set? 2 [_]
  false)

(defmethod contains-valid-set? 3 [collection]
  (set/valid? collection))

(defmethod contains-valid-set? 4 [collection]
  ((some-fn some-joker? (complement only-two-symbols?)) collection))

(defmethod contains-valid-set? 5 [_]
  true)
