package com.asuraiv.kotlinpractice.leetcode

/*
    1748. Sum of Unique Elements
 */
fun sumOfUnique(nums: IntArray): Int {

    val map = mutableMapOf<Int, Int>()

    for(num in nums) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    var answer = 0

    for(key in map.keys) {
        val curr = map[key]
        if(curr == 1) {
            answer += key
        }
    }

    return answer
}