package com.asuraiv.kotlinpractice.leetcode

/*
    832. Flipping an Image
 */
fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {

    val answer = Array(size = A.size) { intArrayOf() }

    for(i in A.indices) {

        val innerSize = A[i].size

        answer[i] = IntArray(size = innerSize)

        var innerIdx = 0

        for(j in (innerSize - 1) downTo 0) {

            answer[i][innerIdx++] = if(A[i][j] == 0) 1 else 0
        }
    }

    return answer
}

class FlipAndInvertImage {
    companion object {
        @JvmStatic
        fun main() {
            println(flipAndInvertImage(A = arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )))
        }
    }
}
