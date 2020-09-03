(ns basics.core
  (:gen-class))

"Defines function foo that takes one arg. x and mult. it by 5"
(defn foo [x] (* x 5))

"Functions takes one argument and increment it by 1"
"is a just a document of function"
(defn increment "Functions takes one argument and increment it by 1" [x] 
  (+ x 1)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Expression (+ 2 3) result should be 5" " = " (+ 2 3))
  (println "Nested (* (+ 1 1) 3) result should be 6" " = " (* (+ 1 1) 3))
  (println "Nested (* (+ 1 1) (- 7 (* 2 2))) result should be 6" " = " (* (+ 1 1) (- 7 (* 2 2))))

  "Use variables"
  (def x 42)
  (println "Variable X" " = " x)
  (def x_multiple_by_2 (* x 2))
  (println "Variable X mult. by 2" " = " x_multiple_by_2)

  (println "Call a function foo with arg 5" " = " (foo 5))

  (def inc_x (increment x))
  (println "Value of incremented x is" inc_x)
)
