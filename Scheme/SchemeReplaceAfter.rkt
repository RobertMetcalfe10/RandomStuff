;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeReplaceAfter) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define replaceAfter(lambda(A X Y L)
  (cond 
    ((< (length L) 2) L)
    ((and (equal? (car L) A)
          (equal? (cadr L) X))
     (cons (car L) (cons Y (replaceAfter A X Y (cddr L)))))
    (else (cons (car L) (replaceAfter A X Y (cdr L)))))))