(ns risk-cards.collection
  (:require [risk-cards.set :as set]))

(defmulti contains-valid-set? count)

(defmethod contains-valid-set? 0 [_]
  false)

(defmethod contains-valid-set? 1 [_]
  false)

(defmethod contains-valid-set? 2 [_]
  false)

(defmethod contains-valid-set? 3 [collection]
  (set/valid? collection))

(defn- some-joker? [collection]
  (some set/joker? collection))

(defmethod contains-valid-set? 4 [collection]
  (or (some-joker? collection)
    (not= 2 (count (distinct collection)))))
