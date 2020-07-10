package com.asuraiv.kotlinpractice.generics

import java.lang.StringBuilder


// #1 제네릭을 사용한 확장 프로퍼티
// 모든 리스트 타입에 이 확장 프로퍼티를 사용할 수 있다.
val <T> kotlin.collections.List<T>.penultimate: T
    get() = this[size - 2]

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.penultimate)

    // #2 제네릭의 상한 타입으로 Comparable을 선언.
    fun <T : Comparable<T>> max(first: T, second: T): T = if(first > second) first else second

    println(max(1, 2)) // 2 출력
    // println(max(1, "two")) // compile error


    // #3 타입 파라미터에 여러 제약 가하기
    fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
            if(!seq.endsWith('.')) {
                seq.append('.')
            }
        }

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld) // Hello World. 출력
}

