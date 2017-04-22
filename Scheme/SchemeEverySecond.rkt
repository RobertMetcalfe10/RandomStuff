;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeEverySecond) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define everySecond (lambda (L) (cond ((null? L) '())
                                      ((null? (cdr L)) (list (car L)))
                                      (#t(append(list(car L))(everySecond(cdr (cdr L))))))))