package com.asuraiv.kotlinpractice.leetcode

/*
    1450. Number of Students Doing Homework at a Given Time
 */
fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
    var answer = 0
    startTime.zip(other = endTime) {
        start, end ->
            if(queryTime in start..end) {
                answer++
            }
    }
    return answer
}