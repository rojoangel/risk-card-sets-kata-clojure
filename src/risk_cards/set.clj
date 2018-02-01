(ns risk-cards.set)

(defn- all-equal? [card-set]
  (apply = card-set))

(defn- all-different? [card-set]
  (= card-set (distinct card-set)))

(defn- joker? [card]
  (= \J card))

(defn remove-jokers [card-set]
  (remove joker? card-set))

(defn valid? [card-set]
  (->> card-set
       (remove-jokers)
       ((some-fn all-equal? all-different?))))
