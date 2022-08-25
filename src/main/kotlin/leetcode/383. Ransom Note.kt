package leetcode

/*
 * Task from LeetCode: https://leetcode.com/problems/ransom-note/
 */

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    for (i in ransomNote.indices) {
        if (ransomNote.count { it == ransomNote[i] } > magazine.count { it == ransomNote[i] }) {
            return false
        }
    }
    return true
}

fun main() {
    println(canConstruct("a","b")) // false
    println(canConstruct("aa", "ab")) // false
    println(canConstruct("aa", "aab")) // true
}