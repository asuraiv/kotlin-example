package com.asuraiv.kotlinpractice.collection

import com.asuraiv.kotlinjavapractice.collection.CollectionUtils.upperCaseAll

fun main(args: Array<String>) {

    val list = listOf("john", "marry", "james")

    for(i in list.indices) {

        println(list[i])
    }

    println(upperCaseAll(list))
    println(list.first())
}

