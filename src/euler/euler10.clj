(ns euler.euler10)

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

#_(->>
     (generate-primes)
     (take 200000)
     (filter #(< % 2000000))
     (apply +))

