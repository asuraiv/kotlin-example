package com.asuraiv.kotlinpractice.leetcode

/*
    1266. Minimum Time Visiting All Points

    On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.

    You can move according to the next rules:

    In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
    You have to visit the points in the same order as they appear in the array.
 */
fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {

    var seconds = 0

    for(i in 0 until (points.size - 1)) {

        var x = points[i][0]
        var y = points[i][1]

        val nextX = points[i + 1][0]
        val nextY = points[i + 1][1]

        while(x != nextX || y != nextY) {

            if(x < nextX) {
                x++
            }

            if(x > nextX) {
                x--
            }

            if(y < nextY) {
                y++
            }

            if(y > nextY) {
                y--
            }

            seconds++
        }
    }

    return seconds
}

fun main() {

    assert(minTimeToVisitAllPoints(arrayOf(
        intArrayOf(1, 1),
        intArrayOf(3, 4),
        intArrayOf(-1, 0)
    )) == 7)
}