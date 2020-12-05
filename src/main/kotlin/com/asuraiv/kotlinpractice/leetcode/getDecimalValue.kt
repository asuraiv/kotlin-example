package com.asuraiv.kotlinpractice.leetcode

/*
    1290. Convert Binary Number in a Linked List to Integer

    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

    Return the decimal value of the number in the linked list.
 */
class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

fun getDecimalValue(head: ListNode?): Int {
    var answer = 0
    var currNode: ListNode? = head

    while(currNode != null) {

        val currVal = currNode.`val`

        answer = answer shl 1

        if(currVal == 1) {
            answer += 1
        }

        currNode = currNode.next
    }

    return answer
}

fun main() {
    val head = ListNode(1)
    head.next = ListNode(0)
    head.next!!.next = ListNode(1)

    assert(getDecimalValue(head) == 5)
}