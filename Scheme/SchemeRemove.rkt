;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeRemove) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define remove(lamda (N L)(cond ((= N 0) L)
                               ((null? L) L)
                               ((> N 1)(remove (- N 1)(cdr L))))))