package com.asuraiv.kotlinpractice.applyandwith

import java.lang.StringBuilder

fun main(args: Array<String>) {

    fun alphabet() = StringBuilder().apply {

        for(letter in 'A'..'Z') {

            append(letter)
        }

        append("\nNow I know the alphabet!")
    }.toString()

    println(alphabet())
}