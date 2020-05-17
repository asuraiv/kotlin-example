package com.asuraiv.kotlinpactice.smartcast

class SmartCastTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
        }
    }
}