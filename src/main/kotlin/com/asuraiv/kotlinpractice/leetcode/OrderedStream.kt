package com.asuraiv.kotlinpractice.leetcode

/*
    1656. Design an Ordered Stream

    There is a stream of n (id, value) pairs arriving in an arbitrary order, where id is an integer between 1 and n and value is a string. No two pairs have the same id.

    Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.

    Implement the OrderedStream class:

    OrderedStream(int n) Constructs the stream to take n values.
    String[] insert(int id, String value) Inserts the pair (id, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order.
 */
class OrderedStream(n: Int) {

    var ptr = 0
    val array = Array(size = n) { "" }

    fun insert(id: Int, value: String): List<String> {

        val idx = id - 1
        array[idx] = value

        val retList = mutableListOf<String>()

        if(ptr == idx) {
            while(ptr < array.size && array[ptr] != "") {
                retList.add(array[ptr])
                ptr++
            }
        }

        return retList
    }
}

fun main() {
    val stream = OrderedStream(5)
    println(stream.insert(3, "c"))
    println(stream.insert(1, "a"))
    println(stream.insert(2, "b"))
    println(stream.insert(5, "e"))
    println(stream.insert(4, "d"))
}

