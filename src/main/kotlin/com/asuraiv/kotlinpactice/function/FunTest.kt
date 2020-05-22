package com.asuraiv.kotlinpactice.function

class FunTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val collection = listOf(1, 2, 3)

            println(joinToString(collection, ", ", "<", ">")) // 기본 함수 호출

            println(joinToString(collection, separator = " | ", prefix = "")) // 이름 붙인 인자

            println(joinToString(collection)) // 부분 적용

            println("Kotlin".lastChar()) // 확장 함수 호출
        }
    }
}