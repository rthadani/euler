(ns euler.euler4)

(defn three-digit-numbers []
  (range 100 1000))

(defn palindrome? [a]
  (let [x (seq(str a))]
    (= x (reverse x))))

(defn all-products []
  (mapcat (fn[left]
         (map #(vector left %) (three-digit-numbers)))
       (three-digit-numbers)))

(defn largest-palindrome []
  (->> (all-products)
       (map (fn [[x y]](* x y)))
       (filter palindrome?)
       (apply max)))

(largest-palindrome)



