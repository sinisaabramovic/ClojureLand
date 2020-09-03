(ns basics.core
  (:gen-class))

"Defines function foo that takes one arg. x and mult. it by 5"
(defn foo [x] (* x 5))

"Functions takes one argument and increment it by 1"
"is a just a document of function"
(defn increment "Functions takes one argument and increment it by 1" [x] 
  (+ x 1)
)

(defn header []
  (println "")
  (println "******************************")
  (println "")
)

(defn footer []
  (println "")
  (println "**************END**************")
  (println "")
)

"Basic data types"
(defn basic_types []
  (header)
  (println "Basic Data Types in Clojure")
  (println "mod 23 2" " = " (mod 23 2))
  (println "min of 2 23 2 54 124 9 0 -12" " = " (min 2 23 2 54 124 9 0 -12))
  (println "max of 2 23 2 54 124 9 0 -12" " = " (max 2 23 2 54 124 9 0 -12))
  (println "Decimal dev 23.8 and 8" " = " (/ 23.8 8))
  (println "Random number to 10" " = " (rand 10))
  (println "Random number to 10 but integer" " = " (rand-int 10))
  (println "PI" " = " (Math/PI))
  (println "E" " = " (Math/E))
  (println "SIN of PI" " = " (Math/sin Math/PI))
  (println "SIN of PI/2" " = " (Math/sin (/ Math/PI 2)))
  (println "SIN of PI/4" " = " (Math/sin (/ Math/PI 4)))
  (println "2 on exp 10 should be 1024" " = " (Math/pow 2 10))

  (println "Strings")
  (println "Length of Hello should be 5" " = " (.length "Hello"))
  (footer)
)

(defn baisc_expressions []
  (header)
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
  (footer)
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (baisc_expressions)
  (basic_types)
)
