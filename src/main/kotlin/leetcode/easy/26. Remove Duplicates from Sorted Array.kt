package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

fun removeDuplicates(nums: IntArray): Int {
    var index = 1
    for (i in 1 until nums.size) {
        if (nums[index - 1] != nums[i]) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}

fun main() {
    println(removeDuplicates(intArrayOf(1, 1, 2))) // 2
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))) // 5
}
