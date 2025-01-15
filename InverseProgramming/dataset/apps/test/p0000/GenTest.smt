(set-logic QF_AUFBV) ; Quantifier-free logic with arrays and bit-vectors

; Declare constants
(declare-const n Int)              ; Length of the string
(declare-fun s (Int) Int)          ; Array to represent the string as ASCII values
(declare-const ind Int)            ; First ':' after '['
(declare-const bind Int)           ; Second ':' before ']'

; Character constants (ASCII codes)
(define-const open_bracket Int 91) ; '[' ASCII value
(define-const close_bracket Int 93); ']' ASCII value
(define-const colon Int 58)        ; ':' ASCII value
(define-const pipe Int 124)        ; '|' ASCII value

; Constraints for `ind` and `bind`
(assert (and (>= ind 0) (< ind n)))           ; ind must be a valid index
(assert (and (>= bind 0) (< bind n)))         ; bind must be a valid index

; There exists a '[' before `ind`
(assert (exists ((p Int))
    (and (>= p 0) (< p ind) (= (select s p) open_bracket))
))

; There exists a ']' after `bind`
(assert (exists ((q Int))
    (and (> q bind) (< q n) (= (select s q) close_bracket))
))

; Conditions for colons
(assert (= (select s ind) colon))            ; s[ind] must be ':'
(assert (= (select s bind) colon))           ; s[bind] must be ':'

; Ensure `ind` occurs before `bind`
(assert (< ind bind))

; Count the number of '|' between `ind` and `bind`
(declare-const ans Int)
(assert (= ans (+ 4
    (sum ((i Int)) ; Summing up all occurrences of '|'
        (and (> i ind) (< i bind) (= (select s i) pipe))
    )
)))

; Output is `-1` if conditions are not met
(assert (or (not (exists ((p Int)) ... )) (not (exists ((q Int)) ... )) (>= ind bind)))

; Check satisfiability
(check-sat)

; Output the result
(get-value (ans))
