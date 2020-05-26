package com.asuraiv.kotlinpactice.`object`

import java.lang.IllegalArgumentException

sealed class Expr { // 봉인된 클래스. 해당 클래스의 상속은 내부 클래스들 에게만 가능하다.

    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num ->
                e.value
            is Expr.Sum ->
                eval(e.right) + eval(e.left)
            // 봉인된 클래스의 'when'에서는, 상속가능 타입이 정해져있기 때문에 else 문이 필요없다
//            else ->
//                throw IllegalArgumentException("Unknown expression")
        }
