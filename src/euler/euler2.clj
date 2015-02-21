(ns euler.euler2)

(defn fib-seq []
  (letfn [(gen [a b]
            (lazy-seq (cons a (gen b (+' a b)))))]
    (gen 0 1)))

(defn fib-even<4mil []
  (filter #(and (< % 4000000)(even? %)) (take 100 (fib-seq))))

(defn sum []
  (apply + (fib-even<4mil)))

(sum)

















