package com.asuraiv.kotlinpractice.nulltest

class Something
class Another

fun main(args: Array<String>) {

    println(castFrom(Something()))
}

fun castFrom(something: Something): Another? = something as? Another