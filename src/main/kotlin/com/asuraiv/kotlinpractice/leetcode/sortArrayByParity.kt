package com.asuraiv.kotlinpractice.leetcode

/*
    905. Sort Array By Parity
 */
fun sortArrayByParity(A: IntArray): IntArray {

    val evens = mutableListOf<Int>()
    val odds = mutableListOf<Int>()

    for(value in A) {
        if(value % 2 == 0) {
            evens.add(value)
            continue
        }
        odds.add(value)
    }

    evens.addAll(odds)

    return evens.toIntArray()
}