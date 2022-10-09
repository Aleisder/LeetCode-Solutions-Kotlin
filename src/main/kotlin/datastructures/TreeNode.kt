package datastructures

class TreeNode(var data: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun push(node: Int) {
        if (node < data) {
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