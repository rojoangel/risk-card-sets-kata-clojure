(ns risk-cards.core)

(defn valid? [card-set]
  (or (apply = card-set)
      (= card-set (distinct card-set))))
