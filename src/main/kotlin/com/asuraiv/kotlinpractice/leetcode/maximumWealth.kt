package com.asuraiv.kotlinpractice.leetcode

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for(account in accounts) {
        var sum = 0
        for(money in account) {
            sum += money
        }
        if(max < sum) {
            max = sum
        }
    }
    return max
}

fun main() {

    assert(maximumWealth(
        arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
    ) == 6)
}

