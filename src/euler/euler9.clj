(ns euler.euler9)

(defn generate-hypot[a b]
  (let [a2 (* a a)
        b2 (* b b)
        c2 (+ a2 b2)
        int-sqrt-c2 (int (Math/sqrt c2)) ]
    (if (= (Math/sqrt c2)  (float int-sqrt-c2))
      int-sqrt-c2
      0)))

(defn generate-triplets []
    (for [a (range 1 1000)
          b (range 1 1000)
          :let [c (generate-hypot a b)]
          :when (not (zero? c))]
        [a b c]))


(->>
  (generate-triplets)
  (filter (fn [[a b c]] (= 1000 (+ a b c))))
  (first)
  (apply *))
