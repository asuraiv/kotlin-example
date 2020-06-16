package com.asuraiv.kotlinpractice.applyandwith

import java.lang.StringBuilder

class WithTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val alphabet = fun() : String {

                val result = StringBuilder()

                for(letter in 'A'..'Z') {
                    result.append(letter)
                }

                result.append("\nNow I know the alphabet!")

                return result.toString()
            }

            println(alphabet())


            val withAlphabet = fun() : String {

                val stringBuilder = StringBuilder()

                return with(stringBuilder) {// 첫번째 파라미터는 stringbuilder, 두번째는 람다

                    for(letter in 'A'..'Z') {

                        this.append(letter) // this 사용
                    }

                    append("\nNow I know the alphabet!") // this 생략 가능

                    this.toString()
                }
            }

            println(withAlphabet())

            // 좀 더 깔끔한 방법
            fun refactorWithAlphabet() = with(StringBuilder()) {

                for(letter in 'A'..'Z') {

                    append(letter) // this 사용
                }

                append("\nNow I know the alphabet!") // this 생략 가능

                toString()
            }

            println(refactorWithAlphabet())
        }
    }
}