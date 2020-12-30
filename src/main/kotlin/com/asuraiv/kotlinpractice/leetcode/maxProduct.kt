package com.asuraiv.kotlinpractice.leetcode

/*
    1464. Maximum Product of Two Elements in an Array
 */
fun maxProduct(nums: IntArray): Int {
    var answer = 0
    for(i in 0 until (nums.size - 1)) {
        for(j in (i + 1) until nums.size) {
            val curr = (nums[i] - 1) * (nums[j] - 1)
            if(answer < curr) {
                answer = curr
            }
        }
    }
    return answer
}