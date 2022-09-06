package datastructures

class ListNode(var root: Int) {
    var next: ListNode? = null

    fun push(node: Int) {
        if (next == null) {
            next = ListNode(node)
        }
        else {
            next!!.push(node)
        }
    }

    fun asList(): List<Int> {
        return if (next == null) {
            listOf(root)
        } else {
            listOf(root) + next!!.asList()
        }
    }

}