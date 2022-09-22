package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/search-insert-position/
 */

fun searchInsert(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val indexOfMid = (low + high) / 2
        val guess = nums[indexOfMid]

        if (guess == target) {
            return indexOfMid
        } else if (guess > target) {
            high = indexOfMid - 1
        } else {
            low = indexOfMid + 1
        }
    }
    return low
}

fun main() {
    println(searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 5)) //2
    println(searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 2)) //1
    println(searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 7)) //4
}