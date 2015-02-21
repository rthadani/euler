(ns euler.parallel-prime-sieve
  (:require [clojure.core.async :as async :refer [go-loop >! <! <!! close! to-chan]]))

(def bufsize 512)

(defn gen [upto]
  (to-chan (range 2 upto)))

(defn sieve-filter [in prime]
  (filter #(pos? (rem % prime)) in))

(defn sieve-builder [in]
  (let [out (chan bufsize)]
    (go-loop [in in]
      (if-let [prime (<! in)]
        (do (>! out prime)
          (recur (sieve-filter in prime)))
        (close! out)))
    out))




