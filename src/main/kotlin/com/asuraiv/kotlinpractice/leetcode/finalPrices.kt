package com.asuraiv.kotlinpractice.leetcode

/*
    1475. Final Prices With a Special Discount in a Shop
 */
fun finalPrices(prices: IntArray): IntArray {

    val answer = IntArray(size = prices.size) { 0 }

    for(i in prices.indices) {

        val curr = prices[i]
        var dc = 0

        for(j in (i+1) until prices.size) {
            if(curr >= prices[j]) {
                dc = prices[j]
                break
            }
        }

        answer[i] = curr - dc
    }

    return answer
}