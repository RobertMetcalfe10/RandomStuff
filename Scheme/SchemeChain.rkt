;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeChain) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define chain(lambda L
               (cond
                 ((null? (cdr L)) (car L))
                 (#t ((car L) (apply chain (cdr L))))
                )
               )
  )