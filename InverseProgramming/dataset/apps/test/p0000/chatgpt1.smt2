(declare-const s String)           ; Declare the variable s as a string

(declare-const sb Int)             ; Declare variables for storing indices
(declare-const eb Int)
(declare-const sc Int)
(declare-const ec Int)

; Initialize the variables
(assert (= sb -1))
(assert (= eb -1))
(assert (= sc -1))
(assert (= ec -1))

(define-fun main () Int
  (let ((len_s (str.len s)))       ; Get the length of the string s
    (forall ((i Int))             ; Iterate over the range [0, len_s-1]
      (=> (and (>= i 0) (< i len_s))
        (let ((char (str.at s i))) ; Get the character at index i
          (ite (and (= char (_ char #x91)) (= sb -1))  ; Check for '['
            (setq! sb i)
            (ite (= char (_ char #x93))              ; Check for ']'
              (setq! eb i)
              (ite (and (= char (_ char #x58)) (= sc -1) (not (= sb -1)))  ; Check for ':'
                (setq! sc i)
                ; No other conditions to check
              )
            )
          )
        )
      )
    )

    (ite (or (<= eb sb) (> sc eb))
      -1   ; Return -1 if invalid conditions
      (ite (or (= sb -1) (= eb -1) (= sc -1))
        -1   ; Return -1 if any of sb, eb, or sc is -1
        (let ((cnt 0))
          (forall ((i Int))  ; Iterate over the range [sc + 1, eb - 1]
            (=> (and (>= i (inc sc)) (< i eb))
              (let ((char (str.at s i))) ; Get the character at index i
                (when (= char #\|)
                  (setq! cnt (inc cnt))
                )
              )
            )
          )
          (+ cnt 4) ; Return cnt + 4
        )
      )
    )
  )
)

(assert (= (main) result))   ; Assert the result of the main function
(check-sat)                 ; Check satisfiability
(get-value (result))        ; Get the result value
