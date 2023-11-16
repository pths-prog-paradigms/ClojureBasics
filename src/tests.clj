(defn vc+ [c d] ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) (fn [x y] (. clojure.lang.Numbers (add x y))) c d))
(defn vc- [c d] ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) (fn [x y] (. clojure.lang.Numbers (minus x y))) c d))
(defn cdot [c d] (reduce (fn [x y] (. clojure.lang.Numbers (add x y))) 0 ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) (fn [x y] (. clojure.lang.Numbers (multiply x y))) c d)))
(defn mc+ [a b] ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) vc+ a b))
(defn mc- [a b] ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) vc- a b))
(defn ctranspose [e] ((fn [f c1] ((fn [rec f coll] (lazy-seq (if (seq coll) (do (if (chunked-seq? ((fn [coll] (. clojure.lang.RT (seq coll))) coll)) (let [b (chunk-buffer (int (count (chunk-first ((fn [coll] (. clojure.lang.RT (seq coll))) coll)))))] (dotimes [i (int (count (chunk-first ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))] (chunk-append b (f (.nth (chunk-first (seq coll)) i)))) (chunk-cons (chunk b) (rec rec f (chunk-rest ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) coll))) (rec rec f (rest ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))))))) (fn [rec f coll] (lazy-seq (if (seq coll) (do (if (chunked-seq? ((fn [coll] (. clojure.lang.RT (seq coll))) coll)) (let [b (chunk-buffer (int (count (chunk-first ((fn [coll] (. clojure.lang.RT (seq coll))) coll)))))] (dotimes [i (int (count (chunk-first ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))] (chunk-append b (f (.nth (chunk-first (seq coll)) i)))) (chunk-cons (chunk b) (rec rec f (chunk-rest ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) coll))) (rec rec f (rest ((fn [coll] (. clojure.lang.RT (seq coll))) coll))))))))) f c1)) (fn [coll] (if ((fn [x] ((fn [^Class c x] (. c (isInstance x))) clojure.lang.IPersistentVector x)) coll) (if ((fn [^Class c x] (. c (isInstance x))) clojure.lang.IObj coll) ((fn [^clojure.lang.IObj x m] (. x (withMeta m))) coll nil) (clojure.lang.LazilyPersistentVector/create coll)) (clojure.lang.LazilyPersistentVector/create coll))) e))
(defn mc* [a b] ((fn [f c1 c2] ((fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) (fn ([rec f c1 c2] (lazy-seq (when (if ((fn [coll] (. clojure.lang.RT (seq coll))) c1) ((fn [coll] (. clojure.lang.RT (seq coll))) c2) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x seq] (. clojure.lang.RT (cons x seq))) (f ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [coll] (. clojure.lang.RT (first coll))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2))) (rec rec f ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c1)) ((fn [x] (. clojure.lang.RT (more x))) ((fn [coll] (. clojure.lang.RT (seq coll))) c2)))))))) f c1 c2)) cdot a (ctranspose b)))

(load-file "./solution.clj")
(load-file "./tests-util.clj")

(defn rand-int [lim]
    (- lim
       (int
           (rand (inc (* lim 2))))))

(defn rand-vec [count lim] (mapv (fn [_] (rand-int lim)) (range count)))
(defn rand-matrix [rows cols lim] (mapv (fn [_] (rand-vec cols lim)) (range rows)))

(defn ap-gr [& args] (apply apply group args))
(defn rand-vec-group [gr-name f-name tested correct]
    (ap-gr
        "Basic"
        gr-name
        []
        (repeatedly 20
                    #(let [n (int (rand 10))]
                         (test f-name tested correct false false (rand-vec n 10) (rand-vec n 10))))))
(defn rand-matrix-group [gr-name f-name tested correct]
    (ap-gr
        "Basic"
        gr-name
        []
        (repeatedly 20
                    #(let [n (int (rand 10)) m (int (rand 10))]
                         (test f-name tested correct false false (rand-matrix n m 10) (rand-matrix n m 10))))))
(suite
    (block
        "Basic"
        (group
            "Basic"
            "Basic/Vector+-/Manual"
            []
            (test "v+" v+ vc+ false false [1 2 3] [4 5 6])
            (test "v+" v+ vc+ false false [] [])
            (test "v+" v+ vc+ false false [1 2 3 4 5 6] [4 5 6 7 8 9])
            (test "v-" v- vc- false false [1 2 3] [4 5 6])
            (test "v-" v- vc- false false [] [])
            (test "v-" v- vc- false false [1 2 3 4 5 6] [4 5 6 7 8 9])
            )
        (rand-vec-group "Basic/Vector+/Randomized" "v+" v+ vc+)
        (rand-vec-group "Basic/Vector-/Randomized" "v-" v- vc-)
        (group
            "Basic"
            "Basic/Dot product/Manual"
            []
            (test "dot" dot cdot false false [1 2 3] [4 5 6])
            (test "dot" dot cdot false false [] [])
            (test "dot" dot cdot false false [1 2 3 4 5 6] [4 5 6 7 8 9])
            )
        (rand-vec-group "Basic/Dot product/Randomized" "dot" dot cdot)
        (group
            "Basic"
            "Basic/Matrix+-/Manual"
            []
            (test "m+" m+ mc+ false false [[1 2 3] [4 5 6]] [[7 8 9] [10 11 12]])
            (test "m+" m+ mc+ false false [] [])
            (test "m+" m+ mc+ false false [[] []] [[] []])
            (test "m-" m- mc- false false [[1 2 3] [4 5 6]] [[7 8 9] [10 11 12]])
            (test "m+" m- mc- false false [] [])
            (test "m-" m- mc- false false [[] []] [[] []])
            )

        (rand-matrix-group "Basic/Matrix+/Randomized" "m+" m+ mc+)
        (rand-matrix-group "Basic/Matrix-/Randomized" "m-" m- mc-)
        (group
            "Basic"
            "Basic/Transpose/Manual"
            []
            (test "transpose" transpose ctranspose false false [[1 2 3] [4 5 6]])
            (test "transpose" transpose ctranspose false false [[1 2 3]])
            (test "transpose" transpose ctranspose false false [])
            (test "transpose" transpose ctranspose false false [[] []])
            )
        (ap-gr
            "Basic"
            "Basic/Transpose/Randomized"
            []
            (repeatedly 20
                        #(let [n (int (rand 10)) m (int (rand 10))]
                             (test "transpose" transpose ctranspose false false (rand-matrix n m 10)))))
        (ap-gr
            "Basic"
            "Basic/Matrix*/Randomized"
            []
            (repeatedly 20
                        #(let [n (inc (int (rand 10))) k (inc (int (rand 10))) m (inc (int (rand 10)))]
                             (test "m*" m* mc* false false (rand-matrix n k 10) (rand-matrix k m 10))))))
    )
