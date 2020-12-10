package com.asuraiv.kotlinpractice.leetcode

/*
    1678. Goal Parser Interpretation

    You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

    Given the string command, return the Goal Parser's interpretation of command.
 */
fun interpret(command: String): String {

    var answer = ""

    var prev = -1

    for(i in command.indices) {

        val s: Char = command[i]

        if(s == '(') {
            prev = s.toInt()
            continue
        }

        if(s == ')') {
            if(prev.toChar() == '(') {
                answer += "o"
            }
            prev = s.toInt()
            continue
        }

        answer += s

        prev = s.toInt()
    }

    return answer
}

fun main() {

    assert(interpret("G()()()()(al)") == "gooooal")
}