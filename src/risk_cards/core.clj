(ns risk-cards.core)

(defn valid? [card-set]
  (apply = card-set))
