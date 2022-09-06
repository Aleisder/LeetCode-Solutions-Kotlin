package leetcode
import datastructures.ListNode

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


fun main() {
    val list = ListNode(3)
    list.push(1)
    list.push(5)
    list.push(9)

    println("List: ${list.asList()}")
    val reversedList = reverseList(list)
    println("Reversed list: ${reversedList?.asList()}")
}

