(ns davec504.challenges-test
  (:require [clojure.test :refer :all]
            [davec504.challenges :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (can? user1 :write :book) true))
    (is (= (can? user2 :write :book) false))))
