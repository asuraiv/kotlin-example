package com.asuraiv.kotlinpactice.regex

fun parsePath(path: String) {

    val regex = """(.+)/(.+)\.(.+)""".toRegex()

    val matchResult = regex.matchEntire(path)

    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: ${directory}, name: ${filename}, ext: ${extension}")
    }
}

class RegexTest {


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            parsePath("/Users/asuraiv/Devspace/kotilin-study/helloworld.kt")

            val price = """$99.9"""

            println(price)
        }
    }
}