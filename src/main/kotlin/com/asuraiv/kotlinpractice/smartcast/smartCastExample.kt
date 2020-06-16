package com.asuraiv.kotlinpractice.smartcast

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            // is 연산자로 타입 체크를 했다면, 이후 로직에서 별도의 캐스팅이 필요 없음
            is Num ->
                e.value
            is Sum ->
                eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }
