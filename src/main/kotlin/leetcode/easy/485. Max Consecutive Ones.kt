package leetcode.easy

import kotlin.math.max

/*
 * Task from LeetCode: https://leetcode.com/problems/max-consecutive-ones/
 */

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var c = 0
    var m = 0
    for (i in nums.indices) {
        if (nums[i] == 1) {
            c++
        } else {
            m = maxOf(m, c)
            c = 0
        }
    }
    return maxOf(m, c)
}

fun main() {
    val list = intArrayOf(1, 0, 1, 1, 0, 1)
    println(findMaxConsecutiveOnes(list)) // 2
}