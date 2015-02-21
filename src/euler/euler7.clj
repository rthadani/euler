(ns euler.euler7)

(defn prime? [n]
  (or
    (= 2 n)
    (and (not (even? n))
         (not-any? zero? (map #(rem n %) (range 2 (+ 1 (int (Math/sqrt n)))))))))

(defn generate-primes
  ([]
   (generate-primes 2))
  ([curr]
    (lazy-seq (if (prime? curr)
                    (cons curr (generate-primes (inc curr)))
                    (generate-primes (inc curr))))))

(last (take 10001 (generate-primes)))



