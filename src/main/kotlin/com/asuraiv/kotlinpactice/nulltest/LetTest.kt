package com.asuraiv.kotlinpactice.nulltest

object LetTest {

//    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val email: String? = null

            email?.let {// email이 널이 아니면 함수에 인자를 전달, 널이면 아무것도 수행하지 않음

                sendToEmail(it)
            }
        }

        fun sendToEmail(email: String) {

            println("Send to email. address: ${email}")
        }
//    }

}