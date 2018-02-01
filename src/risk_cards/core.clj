(ns risk-cards.core)

(defn- all-equal? [card-set]
  (apply = card-set))

(defn- all-different? [card-set]
  (= card-set (distinct card-set)))

(defn- joker? [card]
  (= \J card))

(defn- remove-jokers [card-set]
  (remove joker? card-set))

(defn valid? [card-set]
  (or (all-equal? (remove-jokers card-set))
      (all-different? (remove-jokers card-set))))
