;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname SchemeFlatten) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define flatten(lambda (L)(cond
                            ((null? L) '())
                            ((list? (car L))(append (flatten (car L)) (flatten (cdr L))))
                            (#t( cons (car L) (flatten (cdr L)))))))
                        
                  