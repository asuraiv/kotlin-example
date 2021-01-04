package com.asuraiv.kotlinpractice.leetcode

/*
    728. Self Dividing Numbers
 */
fun selfDividingNumbers(left: Int, right: Int): List<Int> {

    val answer = mutableListOf<Int>();

    for(number in left..right) {
        if(isSelfDividingNumber(number)) {
            answer.add(number)
        }
    }

    return answer
}

fun isSelfDividingNumber(number: Int): Boolean {

    if(number < 10) {
        return true
    }
    var remains = number
    while(remains > 0) {
        val selfNumber = remains % 10
        if(selfNumber == 0) {
            return false
        }
        if(number % selfNumber != 0) {
            return false
        }
        remains /= 10
    }
    return true
}
