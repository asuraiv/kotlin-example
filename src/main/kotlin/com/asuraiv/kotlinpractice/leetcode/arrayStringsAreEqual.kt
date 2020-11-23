package com.asuraiv.kotlinpractice.leetcode

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    val joined1 = word1.joinToString(separator = "")
    val joined2 = word2.joinToString(separator = "")
    return joined1 == joined2
}

fun main() {
    assert(arrayStringsAreEqual(arrayOf("a", "bc"), arrayOf("ab", "c")))
}