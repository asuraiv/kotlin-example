package com.asuraiv.kotlinpactice.applyandwith

import java.lang.StringBuilder

class ApplyTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            fun alphabet() = StringBuilder().apply {

                for(letter in 'A'..'Z') {

                    append(letter)
                }

                append("\nNow I know the alphabet!")
            }.toString()

            println(alphabet())
        }
    }
}