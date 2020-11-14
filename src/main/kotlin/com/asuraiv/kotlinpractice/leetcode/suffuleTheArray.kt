package com.asuraiv.kotlinpractice.leetcode


fun shuffle(nums: IntArray, n: Int): IntArray {

    val answer = IntArray( size = 2 * n) { 0 }
    var aIdx = 0

    for (i in 0 until n) {

        answer[aIdx] = nums[i]
        answer[aIdx + 1] = nums[n + i]

        aIdx += 2
    }

    return answer
}

fun main() {

    val answer = shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3)

    answer.forEach(::print)
}