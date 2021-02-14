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

    val map = mutableMapOf<Int, String>()

    var down = true

    var zigzagIdx = 0

    for(i in s.indices) {

        map[zigzagIdx] = (map[zigzagIdx] ?: "") + s[i]

        if(zigzagIdx == (numRows - 1)) {
            down = false
        }

        if (zigzagIdx == 0) {
            down = true
        }

        zigzagIdx = if(down) ++zigzagIdx else /* up */ --zigzagIdx
    }

    var answer = ""

    for(key in map.keys) {
        answer += map[key]
    }

    return answer
}

fun main() {
    assert(convert(s = "PAYPALISHIRING", numRows = 3) == "PAHNAPLSIIGYIR")
}