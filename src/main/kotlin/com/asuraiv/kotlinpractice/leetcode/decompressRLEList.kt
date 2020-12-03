package com.asuraiv.kotlinpractice.leetcode

fun decompressRLElist(nums: IntArray): IntArray {

    var answer =  IntArray(size = 0)

    for(i in nums.indices step 2) {
        val freq = nums[i]
        val value = nums[i + 1]
        answer += IntArray(size = freq) { value }
    }

    return answer
}

fun main() {
    decompressRLElist(arrayOf(1, 2, 3, 4).toIntArray()).forEach(::print)
}

