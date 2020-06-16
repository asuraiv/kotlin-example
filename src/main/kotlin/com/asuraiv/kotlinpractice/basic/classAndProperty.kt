package com.asuraiv.kotlinpractice.basic

// 코틀린의 기본 가시성은 'public'이 다
class Person(
        val name: String,
        var isMarried: Boolean // 쓸 수 있는 프로퍼티.
)

class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean // 커스텀 게터!
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {

    /*
        필드와 접근자를 묶어서 '프로퍼티'라고 한다
        코틀린은 '프로퍼티'를 언어 기본으로 제공한다
     */

    val person = Person("hong", false)
    person.isMarried = false // var 프로퍼티는 '.' 연산자로 접근하여 값을 변경 할 수 있다.

    val rectangle = Rectangle(5, 5)
    println(rectangle.isSquare) // 커스텀 게터 사용
}