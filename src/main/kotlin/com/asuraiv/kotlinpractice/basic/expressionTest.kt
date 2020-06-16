package com.asuraiv.kotlinpractice.basic

fun main(args: Array<String>) {

    /*
     # 아래 함수는 식이 본문이다.
        - 식은 값을 만들어 내며 다른 식의 하위 요소로 계산에 참여할 수 있다.
        - 하지만 문(statement)는 아무런 값을 만들어 내지 않는다.
        - 식이 본문인 함수만 반환 타입을 생략할 수 있다.
    */
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(3, 6))

    // 변수는 타입 추론이 가능하다
    var str = "Hello!"
    // str = 100 // compile error. 이미 문자열로 추론되어 값이 바인딩 되었기 때문에 다른 형식의 값을 넣을 수 없다
    println(str)

    // 문자열 템플릿 (interpolation)
    val name = if(args.size > 0) args[0] else "Kotlin" // if else 문이 식으로 사용됨

    println("Hello, $name")
    println("Hi, ${name}") // 중괄호로도 사용 가능

    // println("$name반가와요!") // compile error. 한글을 한꺼번에 식별자로 인식한다. {}를 사용한다
}