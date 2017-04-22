;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeMinKey) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define minKey
   (lambda( Key   L)
      (cond (   (null? L)              '()                   )
            (  (null? (cdr L) ) (car L))
            ((<= (Key (car L)) (Key (minKey Key (cdr L)))) (car L))
            (#t (minKey Key (cdr L)))
           )
      )
)