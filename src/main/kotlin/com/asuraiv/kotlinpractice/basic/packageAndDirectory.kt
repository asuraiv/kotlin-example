package com.asuraiv.kotlinpractice.basic

import com.asuraiv.kotlinpractice.regex.parsePath // 패키지 내 선언된 함수를 임포트 할 수 있다!

fun main(args: Array<String>) {

    println(parsePath("/Users/asuraiv/hello.txt"))
}