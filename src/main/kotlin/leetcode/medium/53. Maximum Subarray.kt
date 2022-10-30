package leetcode.medium

/*
 * Task from LeetCode: https://leetcode.com/problems/maximum-subarray/
 */

fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var curSum = 0
    for (n in nums) {
        if (curSum < 0) curSum = 0
        curSum += n
        if (curSum > maxSum) maxSum = curSum
    }
    return maxSum
}

fun main() {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))) // 6
    println(maxSubArray(intArrayOf(1))) // 1
    println(maxSubArray(intArrayOf(5, 4, -1, 7, 8))) // 23
}