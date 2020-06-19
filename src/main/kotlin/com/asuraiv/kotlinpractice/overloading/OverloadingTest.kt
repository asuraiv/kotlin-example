package com.asuraiv.kotlinpractice.overloading

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

fun main(args: Array<String>) {

    println(Point(1, 2) + Point(3, 4)) // Point(x=4, y=6)

    val p = Point(10, 20)
    println(p * 1.5)
}