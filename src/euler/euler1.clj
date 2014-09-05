(ns euler.euler1)

(defn multiple_of [x n]
  (= 0 (mod x n)))

(defn multiples_3_or_5 []
  (filter #(or (multiple_of % 3)(multiple_of % 5)) (range 1000)))

(defn sum
  (apply + (multiples_3_or_5)))

(sum)


