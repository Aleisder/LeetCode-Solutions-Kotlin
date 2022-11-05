package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/climbing-stairs/
 */

fun climbStairs(n: Int): Int {
    var preLast = 1
    var last = 2
    var ways = if (n == 1) 1 else 2
    for (i in 3..n) {
        ways = preLast + last
        preLast = last
        last = ways
    }
    return ways
}

fun main() {
    println(climbStairs(2)) // 2
    println(climbStairs(3)) // 3
}