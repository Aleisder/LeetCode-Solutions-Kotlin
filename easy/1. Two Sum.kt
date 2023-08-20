package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/two-sum/
 */

fun twoSum(nums: IntArray, target: Int): IntArray {
    val lackToSum = mutableSetOf<Int>()
    for (i in nums.indices) {
        if (lackToSum.contains(target - nums[i])) {
            return intArrayOf(nums.indexOf(target - nums[i]), i)
        }
        lackToSum.add(nums[i])
    }
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), target = 9).toList()) // [0, 1]
    println(twoSum(intArrayOf(3, 2, 4), target = 6).toList()) // [1, 2]
    println(twoSum(intArrayOf(3, 3), target = 6).toList()) // [0, 1]
}