(ns euler.euler3)

(defn is-prime [n]
  (or
    (= 2 n)
    (not (some #(= 0 (mod n %)) (range 2 (+ 1 (int (Math/sqrt n))))))))

(defn generate-primes-until [n]
  (filter #(is-prime %)(range 2 (+ 1 (int (Math/sqrt n))))))

(defn largest-prime-factor [n]
  (first (filter #(= 0 (mod n %)) (reverse (generate-primes-until n)))))

(largest-prime-factor 600851475143)




