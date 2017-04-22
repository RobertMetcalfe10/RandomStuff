;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeReciprocals) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define reciprocals(lambda (n)(cond ((= n 1) 1)
                                    (#t (+ (/ 1 n)(reciprocals (- n 1)))))))


