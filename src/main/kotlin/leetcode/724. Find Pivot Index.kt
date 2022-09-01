package leetcode

fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var leftSum = 0
    for (i in nums.indices) {
        if (leftSum == (sum - leftSum - nums[i])) { return i }
        leftSum += nums[i]
    }
    return -1
}

fun main() {
    println(pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))) //3
    println(pivotIndex(intArrayOf(1, 2, 3))) //-1
    println(pivotIndex(intArrayOf(2,1,-1))) //0
}
