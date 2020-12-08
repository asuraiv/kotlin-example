package com.asuraiv.kotlinpractice.leetcode

/*
    1588. Sum of All Odd Length Subarrays

    Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

    A subarray is a contiguous subsequence of the array.

    Return the sum of all odd-length subarrays of arr.
 */
fun sumOddLengthSubArrays(arr: IntArray): Int {

    var answer = 0

    val len = arr.size
    var subLen = 1

    while(subLen <= len) {
        for(i in 0 until len) {

            if((i + subLen) > len) {
                break
            }

            var sum = 0

            for(j in i until (i + subLen)) {
                sum += arr[j]
            }

            answer += sum
        }
        subLen += 2
    }

    return answer
}

fun main() {
    assert(sumOddLengthSubArrays(intArrayOf(1, 4, 2, 5, 3)) == 58)
}
