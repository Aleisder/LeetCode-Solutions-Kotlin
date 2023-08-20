package leetcode.easy

fun majorityElement(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size / 2]
}

fun main() {
    println(majorityElement(intArrayOf(3, 2, 3))) //3
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))) //2
}
