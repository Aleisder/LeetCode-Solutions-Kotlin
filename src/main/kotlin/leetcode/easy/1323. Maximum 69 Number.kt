package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/maximum-69-number/
 */

fun maximum69Number (num: Int): Int {
    for (i in 0 until num.toString().length) {
        if (num.toString()[i] == '6') {
            val answer = num.toString().toCharArray()
            answer[i] = '9'
            return answer.joinToString("").toInt()
        }
    }
    return num
}

fun main() {
    println(maximum69Number(9669)) // 9969
    println(maximum69Number(9996)) // 9999
    println(maximum69Number(9999)) // 9999
}