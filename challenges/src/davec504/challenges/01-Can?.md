# 🎯 Your Clojure Challenge: can?
## 🧪 Spec
Implement a pure Clojure function can? that checks if a user is allowed to perform a specific action on a resource.

## ✅ Inputs:
```clojure
{:read #{:book :article}
 :write #{:book}}

:read ; action
:book ; resource
```

## ✅ Expected Behavior:
```clojure
(can? perms :read :book) ;=> true
(can? perms :write :article) ;=> false
```

## 🧠 Constraints:
- [ ] Use idiomatic Clojure
- [ ] No macros, no mutation
- [ ] Can assume well-formed data

## Bare minimum template
```clojure
(ns davec504.challenges.can)

(defn can?
  [perms action resource]
  ;; your implementation here
)

```



