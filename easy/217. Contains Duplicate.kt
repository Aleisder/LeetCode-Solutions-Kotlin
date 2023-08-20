package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/contains-duplicate/
 */

fun containsDuplicate(nums: IntArray): Boolean {
    val duplicates = mutableSetOf<Int>()
    nums.forEach {
        if (duplicates.contains(it)) return true
        duplicates.add(it)
    }
    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1))) // true
    println(containsDuplicate(intArrayOf(1, 2, 3, 4))) // false
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))) // true
}