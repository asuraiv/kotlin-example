package com.asuraiv.kotlinpractice.leetcode

/*
    1436. Destination City
 */
fun destCity(paths: List<List<String>>): String {
    for(i in paths.indices) {
        val end = paths[i][1]
        var isDest = true
        for (j in paths.indices) {
            if (i == j) {
                continue
            }
            if (paths[j][0] == end) {
                isDest = false
            }
        }
        if (isDest) {
            return end
        }
    }
    return ""
}
