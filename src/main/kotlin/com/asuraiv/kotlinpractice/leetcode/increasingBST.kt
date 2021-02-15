package com.asuraiv.kotlinpractice.leetcode

/*
    897. Increasing Order Search Tree
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun increasingBST(root: TreeNode?): TreeNode {

    val answer = TreeNode(-1)

    rearrange(node = root, rearranged =  answer)

    return answer
}

fun rearrange(node: TreeNode?, rearranged: TreeNode) {

    if(node == null) {
        return
    }

    rearrange(node = node.left, rearranged = rearranged)

    appendRight(rearranged, node)

    rearrange(node = node.right, rearranged = rearranged)
}

fun appendRight(rearranged: TreeNode, node: TreeNode) {

    var copy = rearranged

    if(rearranged.`val` == -1) {
        copy.`val` = node.`val`
        return
    }

    while(copy.right != null) {
        copy = copy.right!!
    }

    copy.right = TreeNode(node.`val`)
}

fun main() {

    val root = TreeNode(`val` = 0)
    root.right = TreeNode(`val` = 1)

    increasingBST(root = root)
}

