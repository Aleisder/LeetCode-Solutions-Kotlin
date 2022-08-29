package leetcode

/*
 * Task from LeetCode: https://leetcode.com/problems/running-sum-of-1d-array/
 */

fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) { nums[i] += nums[i - 1] }
    return nums
}

fun main() {
    var result = runningSum(intArrayOf(1, 2, 3, 4))
    result.forEach { print("$it ") } //[1,3,6,10]
    println("")

    result = runningSum(intArrayOf(1, 1, 1, 1, 1))
    result.forEach { print("$it ") } //[1,2,3,4,5]
    println("")

    result = runningSum(intArrayOf(3, 1, 2, 10, 1))
    result.forEach { print("$it ") } //[3,4,6,16,17]
    println("")
}