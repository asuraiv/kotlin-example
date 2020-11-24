package com.asuraiv.kotlinpractice.leetcode

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

    val result = BooleanArray(size = candies.size)

    val max = candies.max()!!

    for (i in candies.indices) {

        val curr = candies[i]
        if((curr + extraCandies) >= max) {
            result[i] = true
            continue
        }
        result[i] = false
    }

    return result
}

fun main() {
    val answer = kidsWithCandies(candies = arrayOf(2, 3, 5, 1, 3).toIntArray(), extraCandies = 3)
    for(i in answer.indices) {
        print("${answer[i]} ")
    }
    println()
}
