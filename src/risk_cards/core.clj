(ns risk-cards.core)

(defn- all-equal? [card-set]
  (apply = card-set))

(defn- all-different? [card-set]
  (= card-set (distinct card-set)))

(defn remove-jokers [card-set]
  (remove #(= \J %) card-set))

(defn valid? [card-set]
  (or (all-equal? (remove-jokers card-set))
      (all-different? card-set)))
