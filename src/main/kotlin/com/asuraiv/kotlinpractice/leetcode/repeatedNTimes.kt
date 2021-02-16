package com.asuraiv.kotlinpractice.leetcode

/*
    961. N-Repeated Element in Size 2N Array
 */
fun repeatedNTimes(A: IntArray): Int {
    val n = A.size / 2
    val map = mutableMapOf<Int, Int>()

    for(elem in A) {

        val repeats = map[elem] ?: 0

        if((repeats + 1) == n) {
            return elem
        }

        map[elem] = repeats + 1
    }

    return -1
}