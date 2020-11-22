package com.asuraiv.kotlinpractice.leetcode

/*
    Given an array of integers nums.

    A pair (i,j) is called good if nums[i] == nums[j] and i < j.

    Return the number of good pairs.
 */
fun numIdenticalPairs(nums: IntArray): Int {
    var answer = 0
    for (i in 0 until nums.size - 1) {
        for (j in (i + 1) until nums.size) {
            if (nums[i] == nums[j] && i < j) {
                answer++
            }
        }
    }
    return answer
}

fun main() {
    assert(numIdenticalPairs(arrayOf(1, 2, 3, 1, 1, 3).toIntArray()) == 4)
}