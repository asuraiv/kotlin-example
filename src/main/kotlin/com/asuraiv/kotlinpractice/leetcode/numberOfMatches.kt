package com.asuraiv.kotlinpractice.leetcode

/*
    1688. Count of Matches in Tournament
 */
fun numberOfMatches(n: Int): Int {

    var answer = 0

    var advancedTeams = n

    while(advancedTeams != 1) {

        val matches = (advancedTeams / 2)
        val unearnedWinTeam = advancedTeams % 2

        advancedTeams = matches + unearnedWinTeam

        answer += matches
    }

    return answer
}

fun main() {
    assert(numberOfMatches(n = 7) == 6)
}