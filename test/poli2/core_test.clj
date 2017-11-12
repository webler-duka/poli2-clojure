(ns poli2.core-test
  (:require [clojure.test :refer :all]
            [poli2.core :refer :all]))

(deftest poli2-test
  (testing "Polinom számítás."
    (is (= ((poli2 1 2 3) 0) 3))
    (is (= ((poli2 1 2 3) 1) 6))))

(deftest area-test
  (testing "Területszámítás"
    (is (= (area (poli2 0 0 1) 0 1) 1))
    (is (= (Math/round (float(* 10 (area (poli2 0 1 0) 0 1)))) 5))
    (is (= (Math/round (float(* 100 (area (poli2 1 0 0) 0 1)))) 33))
  ))