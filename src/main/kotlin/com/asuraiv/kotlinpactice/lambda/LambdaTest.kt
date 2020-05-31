package com.asuraiv.kotlinpactice.lambda

class LambdaTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val people = listOf(Person("홍길동", 25), Person("김철수", 30))

            println(findMaxAge(people))
        }
    }
}