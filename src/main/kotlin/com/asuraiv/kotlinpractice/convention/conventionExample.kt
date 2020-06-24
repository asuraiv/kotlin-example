package com.asuraiv.kotlinpractice.convention

import java.lang.IndexOutOfBoundsException

data class Point(val x: Int, val y: Int) {

    // 관례(convention)에 따른 메서드 정의를 통한 산술 연산자 오버로딩
    operator fun plus(other: Point): Point {

        return Point(x + other.x, y + other.y)
    }
}

// 확장 함수 형식으로도 선언 가능
operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

// 피연산자가 같은 타입일 필요는 없다
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

// 결과 타입이 피연산자 타입과 다를 수 있다
operator fun Char.times(count: Int): String {

    return toString().repeat(count)
}

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

class Person(val name: String, val age: Int) {

    // 'data'가 아닌 클래스에서 구조분해를 사용할 수 있게 하는 방법
    operator fun component1() = name
    operator fun component2() = age
}

class Matrix {

    var matrix: Array<Array<Int>>

    constructor(n: Int, m: Int) {

        this.matrix = Array(n) { Array(m) { 0 } }
    }

    operator fun get(rowIndex: Int, colIndex: Int): Int {
        return matrix[rowIndex][colIndex]
    }

    operator fun set(rowIndex: Int, colIndex: Int, value: Int) {
        matrix[rowIndex][colIndex] = value
    }
}

fun main(args: Array<String>) {

    println(Point(1, 2) + Point(3, 4)) // Point(x=4, y=6)

    val p = Point(10, 20)
    println(p * 1.5)

    println("Point 클래스 get 사용: ${p[1]}")

    val (x, y) = p
    println("구조 분해를 통한 값 접근. x: $x, y: $y")

    val hong = Person("Hong", 30)
    val (name, age) = hong
    println("'non data'클래스에서 구조분해 사용. name: $name, age: $age")

    val matrix = Matrix(5, 10)

    matrix[1, 1] = 100 // set도 인자 하나 이상 가능

    println("인자가 하나 이상인 get 사용 ${matrix[1, 1]}")
}