;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeReplaceFirst) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define replaceFirst(lambda(X Y L)
  (cond ((null? L) '()) 
    ((equal? (car L) X) (cons Y (cdr L)))
    (else (cons (car L) (replaceFirst X Y (cdr L)))))))