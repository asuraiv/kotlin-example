package com.asuraiv.kotlinpractice.leetcode

/*
    1572. Matrix Diagonal Sum
 */
fun diagonalSum(mat: Array<IntArray>): Int {

    var left = 0
    var right = mat[0].size - 1

    var top = 0
    var bottom = mat.size - 1

    var answer = 0

    while(top <= bottom) {

        if(top == bottom) {
            val mid = mat[top].size / 2
            answer += mat[top][mid]
            break
        }

        answer += mat[top][left]
        answer += mat[top][right]
        answer += mat[bottom][left]
        answer += mat[bottom][right]

        left++
        right--

        top++
        bottom--
    }

    return answer
}

class DiagonalSum {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(diagonalSum(mat = arrayOf(
                intArrayOf(5)
            )))
        }
    }
}
