;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeConsToAll) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define consToAll(lambda (A L)(cond ((null? L) '())
                                    (#t(cons(cons A (car L)) (consToAll A (cdr L)))))))               