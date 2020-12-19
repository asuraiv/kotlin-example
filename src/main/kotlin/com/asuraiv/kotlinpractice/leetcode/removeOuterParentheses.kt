package com.asuraiv.kotlinpractice.leetcode

/*
    1021. Remove Outermost Parentheses
 */
@OptIn(ExperimentalStdlibApi::class)
fun removeOuterParentheses(S: String): String {

    val stack = ArrayDeque<Char>()

    val primitives = mutableListOf<String>()
    var primitive = ""

    for(i in S.indices) {

        val curr = S[i]

        when(curr) {
            ')' -> stack.removeLast()
            else -> stack.addLast(curr)
        }

        primitive += curr

        if(stack.isEmpty()) {
            primitives.add(primitive)
            primitive = ""
        }
    }

    return primitives.joinToString(separator = "") {
        it.subSequence(1 until (it.length - 1))
    }
}

fun main() {
    assert(removeOuterParentheses(S = "(()())(())(()(()))") == "()()()()(())")
}
