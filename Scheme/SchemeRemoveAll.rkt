;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeRemoveAll) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define (removeAll V L)(cond ((null? L) L)
                             ((list? (car L))
                             (cons (removeAll V (car L)) (removeAll V (cdr L))))
                             ((equal? V (car L)) (removeAll V (cdr L)))
                             (else (cons (car L) (removeAll V (cdr L))))))