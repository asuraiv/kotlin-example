package com.asuraiv.kotlinpractice.leetcode

/*
    1684. Count the Number of Consistent Strings
 */
fun countConsistentStrings(allowed: String, words: Array<String>): Int {

    var answer = 0

    for(word in words) {
        var consistent = true
        for(i in word.indices) {
            if(!allowed.contains(word[i])) {
                consistent = false
                break
            }
        }
        if(consistent) {
            answer++
        }
    }

    return answer
}

fun main() {

    val answer = countConsistentStrings(allowed = "cad", words = arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d"))
    assert(answer == 4)
}