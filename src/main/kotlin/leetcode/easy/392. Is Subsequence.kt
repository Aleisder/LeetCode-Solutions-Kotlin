package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/is-subsequence/
 */
fun isSubsequence(s: String, t: String): Boolean {
    var i = 0; var j = 0
    while(i < s.length && j < t.length) {
        if (s[i] == t[j]) { i++ }
        j++
    }
    return i == s.length
}

fun main() {
    println(isSubsequence("abc", "ahbgdc")) // true
    println(isSubsequence("axc", "ahbgdc")) // false
}
