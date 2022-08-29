package leetcode

/*
 * Task from LeetCode: https://leetcode.com/problems/power-of-three/
 */
fun isPowerOfThree(n: Int): Boolean {
    var number = n.toDouble()
    while (number > 1) {
        number /= 3
    }
    return number == 1.0
}

fun main() {
    println(isPowerOfThree(27)) //true
    println(isPowerOfThree(0)) //false
    println(isPowerOfThree(9)) //true
}