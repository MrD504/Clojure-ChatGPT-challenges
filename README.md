# 🧠 Clojure Challenges — Deliberate Practice

This repo is a collection of daily Clojure challenges designed for deep skill-building, test-driven development, and mastering the core idioms of functional programming.

---

## 🚀 Goals

- **Fluency** in core Clojure functions (`map`, `reduce`, `some`, etc.)
- **Idiomatic thinking**: data-driven, composable, expressive
- **TDD discipline**: write failing tests first, then green them with clean solutions
- **Minimalism**: no frameworks, just Clojure + `clojure.test`

---

## 🗂️ Structure

- All code is in `src/`
  - e.g. `src/davec504/challenges/can.clj`
- All tests are in `test/`
  - e.g. `test/davec504/challenges/can_test.clj`
- Each challenge:
  - Has a clear function spec
  - Is tested with real use cases
  - May be extended incrementally

---

## 📦 Running Tests

Run all tests:

```bash
clj -X:test
```

Or if you prefer the older `-M` style:

```bash
clj -M:test
```

Colored output supported via [`humane-test-output`](https://github.com/pjstadig/humane-test-output).

---

## 🔁 Workflow

1. Start a REPL:
   ```bash
   clj -M:nrepl
   ```
2. Open a `.clj` file in Neovim
3. Use Conjure to evaluate code inline
4. Run tests frequently with `clj -X:test`
5. Work in `(comment ...)` blocks to sketch and test ideas

---

## ✅ Example: `can?`

```clojure
(defn can?
  [user action resource]
  (let [rules (get-in user [:role :rules])]
    (boolean
      (some #(and (= action (:action %))
                  (= resource (:resource %)))
            rules))))
```

Tested using:

```clojure
(is (can? user1 :write :book))
(is (not (can? user2 :write :book)))
```

---

## 🧰 Tooling

- `deps.edn` with:
  - `:test` alias for test runner
  - `:nrepl` alias for interactive development
- [Conjure](https://github.com/Olical/conjure) for editor integration
- `pjstadig/humane-test-output` for pretty test diffs

---

## 💡 Why This Exists

This is not a tutorial repo. This is a **practice arena** — a place to:

- Strengthen habits
- Build true understanding
- Revisit primitives until they become natural

---

## 🗓️ Challenge Log

| Challenge | Description |
|----------|-------------|
| `can?` | Check if a user can perform an action on a resource based on role rules |

More will be added over time.

