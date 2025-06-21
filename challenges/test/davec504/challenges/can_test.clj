(ns davec504.challenges.can-test
  (:require [clojure.test :refer :all]
            [davec504.challenges.can :refer :all]))

(deftest a-test
  (testing "Check if user has permission to perfom actions"
    (is (= (can? user1 :write :book) true))
    (is (= (can? user2 :write :book) false))))
