(ns poli2.core)

(defn poli2
  "Másodfokú függvény generáló függvény"
  [a b c]
  (fn [x]
    (+ (* a x x) (* b x) c)))

(defn area
  "Területszámítás"
  [polinom a b]
  (let
    [delta 1000]
    (reduce
      #(+ %1 (/ (polinom (+ a (/ (* (- b a) %2) delta))) delta))
      0
      (range 0 delta))))

(defn -main
  []
  (println "a b c x y:")
  (let [[a b c x y] (map read-string (clojure.string/split (read-line) #" "))]
    (println (float (area (poli2 a b c) x y)))))
