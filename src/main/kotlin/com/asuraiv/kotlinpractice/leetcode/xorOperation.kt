package com.asuraiv.kotlinpractice.leetcode

/*
    Given an integer n and an integer start.

    Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

    Return the bitwise XOR of all elements of nums.
 */
fun xorOperation(n: Int, start: Int): Int {

    val nums = mutableListOf<Int>()

    for(i in 0 until n) {
        nums.add(start + (2 * i))
    }

    return nums.reduce { answer, num -> answer xor num  }
}

fun main() {
    assert(xorOperation(n = 5, start = 0) == 8)
}