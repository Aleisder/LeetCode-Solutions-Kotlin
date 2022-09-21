package datastructures

class TreeNode(var root: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun push(node: Int) {
        if (node < root) {
            if (left == null) {
                left = TreeNode(node)
            } else {
                left!!.push(node)
            }
        } else {
            if (right == null) {
                right = TreeNode(node)
            } else {
                right!!.push(node)
            }
        }
    }
}

fun main() {
    val tree = TreeNode(4)
    tree.push(2)
    tree.push(6)
    tree.push(1)
    println("Hello")
}