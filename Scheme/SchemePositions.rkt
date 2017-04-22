;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemePositions) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define positions(lambda (N A L)(cond ((null? L)'())
                                      ((equal? A (car L))(cons N (positions(+ N 1) A (cdr L))))
                                      (#t (positions(+ N 1) A (cdr L))))))