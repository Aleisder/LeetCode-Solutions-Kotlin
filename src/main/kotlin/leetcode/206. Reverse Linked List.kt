package leetcode

/*
 * Task from LeetCode: https://leetcode.com/problems/reverse-linked-list/
 */

fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }
    val rest = reverseList(head.next)
    head.next!!.next = head
    head.next = null
    return rest
}

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



fun main() {
    val list = ListNode(3)
    list.push(1)
    list.push(5)
    list.push(9)

    println("List: ${list.asList()}")
    val reversedList = reverseList(list)
    println("Reversed list: ${reversedList?.asList()}")
}

