package com.asuraiv.kotlinpractice.leetcode.medium

/*
    6. ZigZag Conversion

    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R

    And then read line by line: "PAHNAPLSIIGYIR"

    Write the code that will take a string and make this conversion given a number of rows:

    string convert(string s, int numRows);
 */
fun convert(s: String, numRows: Int): String {

    val marker = Array(size = s.length) { 0 }

    var plus = true

    var zigzagIdx = 0

    for(i in s.indices) {

        marker[i] = zigzagIdx

        if(zigzagIdx == (numRows - 1)) {
            plus = false
        }

        if (zigzagIdx == 0) {
            plus = true
        }

        zigzagIdx = if(plus) ++zigzagIdx else --zigzagIdx
    }

    var answer = ""

    for(i in 0 until numRows) {

        for(j in s.indices) {
            if(marker[j] == i) {
                answer += s[j]
            }
        }
    }

    return answer
}

fun main() {
    assert(convert(s = "PAYPALISHIRING", numRows = 4) == "PINALSIGYAHRPI")
}