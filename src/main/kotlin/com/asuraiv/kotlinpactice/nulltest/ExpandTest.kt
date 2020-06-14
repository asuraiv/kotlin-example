package com.asuraiv.kotlinpactice.nulltest

class ExpandTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val str: String? = null

            println(str.isNullOrBlank())
        }
    }
}

fun String?.isNullOrBlank(): Boolean = this == null || this.isBlank()