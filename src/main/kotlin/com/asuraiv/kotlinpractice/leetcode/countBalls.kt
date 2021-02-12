package com.asuraiv.kotlinpractice.leetcode

/*
    1742. Maximum Number of Balls in a Box
 */
fun countBalls(lowLimit: Int, highLimit: Int): Int {

    val map = mutableMapOf<Int, Int>()

    for(ballNum in lowLimit..highLimit) {

        val boxNum = sumOfDigits(ballNum)

        map[boxNum] = (map[boxNum] ?: 0) + 1
    }

    return map.values.max()!!
}

fun sumOfDigits(n: Int): Int {

    var number = n
    var sum = 0

    while(number != 0) {

        val divided = number / 10

        sum += number % 10

        number = divided
    }

    return sum
}