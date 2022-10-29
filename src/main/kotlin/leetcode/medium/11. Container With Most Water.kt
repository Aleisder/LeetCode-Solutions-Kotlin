package leetcode.medium

/*
 * Task from LeetCode: https://leetcode.com/problems/container-with-most-water/
 */

fun maxArea(height: IntArray): Int {
    if (height.size == 1) { return height[0] }

    var low = 0
    var high = height.size - 1
    var area = 0
    while (high >= low) {
        val lowBorder = if (height[low] < height[high]) height[low] else height[high]
        val currentArea = (high - low) * lowBorder

        if (currentArea > area) {
            area = currentArea
        }

        if (lowBorder == height[low]) {
            low++
        } else {
            high--
        }
    }
    return area
}

fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))) // 49
    println(maxArea(intArrayOf(1))) // 1
}