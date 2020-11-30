package com.asuraiv.kotlinpractice.leetcode

fun restoreString(s: String, indices: IntArray): String {

    val result = Array(size = s.length) { "" }

    for(i in 0 until s.length) {
        val c = s[i]
        result[indices[i]] = c.toString()
    }

    return result.joinToString(separator = "")
}

fun main() {
    assert(restoreString(s = "codeleet", indices = intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)) == "leetcode")
}