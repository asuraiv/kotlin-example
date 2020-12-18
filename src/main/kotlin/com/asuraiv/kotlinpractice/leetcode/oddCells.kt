package com.asuraiv.kotlinpractice.leetcode

/*
    1252. Cells with Odd Values in a Matrix
 */
fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int {

    val matrix = Array(size = n) { Array(size = m) { 0 } }

    for(i in indices.indices) {

        val ri = indices[i][0]
        val ci = indices[i][1]

        for(j in matrix.indices) {
            for(k in matrix[j].indices) {
                if(j == ri) {
                    matrix[j][k] += 1
                }
                if(k == ci) {
                    matrix[j][k] += 1
                }
            }
        }
    }

    var answer = 0

    for(i in matrix.indices) {
        for(j in matrix[i].indices) {
            if(matrix[i][j] % 2 > 0) {
                answer++
            }
        }
    }

    return answer
}

fun main() {
    println(oddCells(n = 2, m = 3, indices = arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))))
}