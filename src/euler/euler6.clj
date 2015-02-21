(ns euler.euler6)

(defn n-numbers [n]
  (range 1 (+ n 1)))

(defn sum-of-squares [n]
  (reduce #( + (* %2 %2) %) (n-numbers n)))

(defn square-of-sum [n]
  (Math/pow (apply + (n-numbers n)) 2))

(bigint (-' (square-of-sum 100) (sum-of-squares 100)))
