package com.asuraiv.kotlinpractice.collectionandlambda

import com.asuraiv.kotlinpractice.collection.CollectionUtils.upperCaseAll

fun main() {

    val list = listOf("john", "marry", "james")

    for(i in list.indices) {

        println(list[i])
    }

    println(upperCaseAll(list))
    println(list.first())
}

