(ns euler.euler4)

(defn gcd [x y]
  (if (zero? x)
    y
    (recur (mod y x) x)))

(defn lcm [x y]
  (if (> x y)
    (lcm y x)
    (* x (quot y (gcd x y)))))

(defn smallest-divisible-range [n]
  (reduce lcm (range 1 (+ 1 n))))

(smallest-divisible-range 20)

