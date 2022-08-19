package leetcode

/*
 * Task from LeetCode: https://leetcode.com/problems/valid-parentheses/
 */

fun isValid(s: String): Boolean {
    if (s == "") { return true }
    val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
    if (simplified == s) { return false }
    return isValid(simplified)
}

fun main() {

    println(isValid("()")) //true

    println(isValid("()[]{}")) //true

    println(isValid("(]")) //false

    println(isValid("([)]")) //false
}