package com.asuraiv.kotlinpractice.leetcode

/*
    1299. Replace Elements with Greatest Element on Right Side
 */
fun replaceElements(arr: IntArray): IntArray {

    val answer = IntArray(size = arr.size) { -1 }

    for(i in arr.indices) {

        val max = arr.copyOfRange(i + 1, arr.size).max()

        max?.let {
            answer[i] = max
        }
    }

    return answer
}