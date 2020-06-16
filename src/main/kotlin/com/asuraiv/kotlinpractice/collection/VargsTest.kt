package com.asuraiv.kotlinpractice.collection

class VargsTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val list = listOf("args: ", *args)

            println(list)
        }
    }
}