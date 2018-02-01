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

(defmethod contains-valid-set? 4 [_]
  false)