package com.asuraiv.kotlinpractice.leetcode

import java.util.*
import kotlin.math.max

fun maxDepth(s: String): Int {

    var maxDepth = 0
    var depth = 0

    val stack = Stack<Int>()

    for(c in s.chars()) {
        when(c) {
            '('.toInt() -> {
                stack.push(c)
                depth++
            }
            ')'.toInt() -> {
                maxDepth = max(maxDepth, depth)
                depth--
            }
        }
    }

    return maxDepth
}

fun main() {
    assert(maxDepth("(1+(2*3)+((8)/4))+1") == 3)
}

