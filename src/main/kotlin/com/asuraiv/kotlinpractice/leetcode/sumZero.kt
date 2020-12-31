package com.asuraiv.kotlinpractice.leetcode

/*
    1304. Find N Unique Integers Sum up to Zero
 */
fun sumZero(n: Int): IntArray {

    val answer = IntArray(size = n)
    var idx = 0
    val isOdd = n % 2 != 0

    if(isOdd) {
        answer[idx++] = 0
    }

    var integer = 1

    while(idx < n) {
        answer[idx++] = integer
        answer[idx++] = -integer
        integer++
    }

    return answer
}