package com.asuraiv.kotlinpractice.nulltest

fun main(args: Array<String>) {

    val str: String? = null

    println(str.isNullOrBlank())
}

fun String?.isNullOrBlank(): Boolean = this == null || this.isBlank()