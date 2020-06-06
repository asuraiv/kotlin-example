package com.asuraiv.kotlinpactice.collection

import com.asuraiv.kotlinpractice.function.LambdaFunctions.*

class CombineWithJava {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            postponeComputation(1000) { println(42) }

            postponeComputation(1000, object : Runnable { // 객체 리터럴 식을 함수형 인터페이스 구현으로 넘기는 방법도 가능 (근데 굳이 이렇게 할 필요는...)
                override fun run() {
                    println(42)
                }
            })
        }
    }
}