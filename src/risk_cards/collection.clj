(ns risk-cards.collection)

(defmulti contains-valid-set? count)

(defmethod contains-valid-set? 0 [_]
  false)
