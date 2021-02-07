package com.asuraiv.kotlinpractice.leetcode

/*
    1720. Decode XORed Array
 */
fun decode(encoded: IntArray, first: Int): IntArray {
    val answer = IntArray(size = encoded.size + 1) { 0 }
    answer[0] = first
    for(i in 1..encoded.size) {
        answer[i] = answer[i - 1] xor encoded[i - 1]
    }
    return answer
}