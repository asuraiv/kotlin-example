package com.asuraiv.kotlinpractice.leetcode

/*
    1370. Increasing Decreasing String
 */
fun sortString(s: String): String {

    val list = s.split("").filter(String::isNotBlank).toMutableList()

    var min = true

    var answer = ""

    var lastSet = mutableSetOf<String>()

    while(list.isNotEmpty()) {

        val removeVal = if(min) {
            list.filter { !lastSet.contains(it) }.min()
        } else {
            list.filter { !lastSet.contains(it) }.max()
        }

        if(removeVal == null) {
            min = !min
            lastSet = mutableSetOf()
            continue
        }

        answer += removeVal
        list.remove(removeVal)
        lastSet.add(removeVal)
    }

    return answer
}
