;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemeChangingFractions) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define changeFunc(lambda (x y)(cond((= x 1) (/ 1 y))
                                    ((= y 1) x)
                                    ((= y x) 1)
                                    (#t (+(/ x y) (changeFunc (- x 1)(- y 1)))))))
                                    



