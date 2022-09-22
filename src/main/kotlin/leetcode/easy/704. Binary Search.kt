package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/binary-search
 */
fun search(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val indexOfMid = (low + high) / 2
        val guess = nums[indexOfMid]

        if (guess == target) {
            return indexOfMid
        }

        else if (guess < target) {
            low = indexOfMid + 1
        }

        else {
            high = indexOfMid - 1
        }
    }
    return -1
}

fun main() {
    println(search(nums = intArrayOf(-1, 0, 3, 5, 9, 12), target = 9)) //4
    println(search(nums = intArrayOf(-1, 0, 3, 5, 9, 12), target = 2)) //-1
}