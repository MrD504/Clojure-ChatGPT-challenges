(ns davec504.challenges)

(def roles
  {:admin {:rules [{:action :read :resource :book}
                   {:action :write :resource :book}]}
   :user  {:rules [{:action :read :resource :book}]}})

(def user1 {:name "user1" :role (:admin roles)})
(def user2 {:name "user2" :role (:user roles)})

(defn can?
  "I don't do a whole lot."
  [user action resource]
  (let [rules (get-in user [:role :rules])]
    (boolean  (some #(and (= action (:action %))
                          (= resource (:resource %)))
                    rules))))

(comment
;; get rules just checking syntax
  (def rules
    (get-in user1 [:role :rules]))

  (can? user1 :write :book)
  (can? user2 :write :book))
