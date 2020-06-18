package com.asuraiv.kotlinpractice.collection

fun main(args: Array<String>) {

    val array = Array<String>(26) { i -> ('a' + i).toString() }

    array.forEach { print("$it ") }
}