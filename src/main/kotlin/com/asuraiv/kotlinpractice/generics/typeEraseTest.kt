package com.asuraiv.kotlinpractice.generics

import java.lang.IllegalArgumentException

fun main() {

    // #1
    println(sumOfList(listOf(1, 2, 3)))

//    println(sumOfList(listOf("1", "2", "3"))) // 캐스팅은 성공하지만(!) 다른 예외가 발생한다

    // #2
    println(isA<String>("Hello!"))
}

// #1
fun sumOfList(list: List<*>): Int {

    val intList = list as? List<Int>
        ?: throw IllegalArgumentException("List is expected")

    return intList.asSequence().sum()
}

// #2
// 'reified' 키워드를 통해 런타임에 타입 파라메터가 실체화 된다. 키워드를 제거하면 지워진 타입 파라메터에 대한 검사를 할 수 없다는 에러가 뜬다.
inline fun <reified T> isA(value: Any) = value is T