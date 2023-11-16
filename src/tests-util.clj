(require 'clojure.string)

(defn group-context [block group passed]
    {:block block :group group :passed passed})

(def pr (comp clojure.core/println str))

(defn log-passed [name args silent-args]
    (pr "        Success (" name (if silent-args " ..)" (str " " (clojure.string/join " " args) ")"))))

(defn log-error [e name args silent-args]
    (pr "        Unexpected " (type e) " during (" name (if silent-args " ..)" (str " " (clojure.string/join " " args) ")")) " evaluation:")
    (.printStackTrace e (. System out)))

(defn log-fail [name args correct-value tested-value silent-args silent-res]
    (pr
        "        Failed ("
        name
        (if silent-args " ..)" (str " " (clojure.string/join ", " args) ")"))
        (if silent-res
            " (Wrong answer)"
            (str "(Expected " correct-value ", got " tested-value ")"))))

(defn add-pass [ctx]
    (group-context (:block ctx) (:group ctx) (inc (:passed ctx))))

(defn add-fail [ctx]
    (group-context (:block ctx) (:group ctx) (:passed ctx)))

(defn test [name tested correct silent-args silent-res & args]
    (fn [ctx]
        (try
            (let [correct-value (apply correct args) tested-value (apply tested args)]
                (if (= tested-value correct-value)
                    (do
                        (log-passed name args silent-args)
                        (add-pass ctx))
                    (do
                        (log-fail name args correct-value tested-value silent-args silent-res)
                        (add-fail ctx))))
            (catch Throwable e (do
                                   (log-error e name args silent-args)
                                   (add-fail ctx))))))

(defn block-context [block passed of passed-groups]
    {:block block :passed passed :of of :passed-groups passed-groups})

(defn group [block name dependencies & tests]
    (fn [block-ctx]
        (pr "    " name ":")
        (let [end-ctx (if
                          (every? (fn [dep] (contains? (:passed-groups block-ctx) dep)) dependencies)
                          (reduce (fn [gr-ctx tst] (tst gr-ctx)) (group-context block name 0) tests)
                          (group-context block name 0))
              new-passed-groups (if
                                    (= (:passed end-ctx) (count tests))
                                    (conj (:passed-groups block-ctx) name)
                                    (:passed-groups block-ctx))
              ]
            (block-context
                (:block block-ctx)
                (+ (:passed block-ctx) (:passed end-ctx))
                (+ (:of block-ctx) (count tests))
                new-passed-groups))))

(defn block [name & groups]
    (pr name ":")
    (reduce (fn [ctx gr] (gr ctx)) (block-context name 0 0 []) groups))

(defn suite [& blocks]
    (count (map #(let [ctx %]
              (pr (:block ctx) ": " (/ (:passed ctx) (:of ctx) 0.01) "%"))
         blocks)))
