;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname SchemePowerFunction) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(define power(lambda(x y)(cond ((= y 1) x)
                               ((= y 0) 1)
                               ((= x 1) 1)
                               (#t (* x(power x(- y 1)))))))

(define psum(lambda(x y)(cond((= y 1) x)
                             (#t (+(power x y) (psum (- x 1)(- y 1)))))))