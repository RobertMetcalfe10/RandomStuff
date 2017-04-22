;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeRemoveFirst) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define removeFirst(lambda (A L)(cond((null? L) L)
                                     ((equal? (car L) A)(cdr L))
                                     (#t(cons(car L)(removeFirst  A(cdr L)))))))
                                      