;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeCountAll) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
;the function count_all : counts every occurence of an item A anywhere in the list L(even in sublists or sublists of sublists)

;(count_all 4 '((1(23)(4(5(6)((7)8)))4))) returns 2.

(define CountAll(lambda (A L)
                            (cond
                                 ((null? L)0)
                                 ((equal? (car L) A)  (+(CountAll A(cdr L))1))
                                 ((not(list? (car L)))   (CountAll A(cdr L)))
                                 (#t (+(CountAll A(car L)) (CountAll A(cdr L)))))))