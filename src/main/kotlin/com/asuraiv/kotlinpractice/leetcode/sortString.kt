package com.asuraiv.kotlinpractice.leetcode

/*
    1370. Increasing Decreasing String
 */
fun sortString(s: String): String {

    var list = s.split("").filter(String::isNotBlank).toMutableList()

    var min = true

    var answer = ""

    while(list.isNotEmpty()) {
        list = (if(min) list.sorted() else list.sortedDescending()).toMutableList()
        var last = ""
        val popIdxList = mutableListOf<Int>()
        for(i in list.indices) {
            val curr = list[i]
            if(curr == "") {
                continue
            }
            if(curr != last) {
                answer += curr
                last = curr
                popIdxList.add(i)
            }
        }
        for(idx in popIdxList) {
            list[idx] = ""
        }
        list = list.filter(String::isNotBlank).toMutableList()
        min = !min
    }

    return answer
}
