package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */

fun removeDuplicates(s: String): String {
    val unique = mutableListOf(s[0])
    for (i in 1 until s.length) {
        if (unique.lastOrNull() == s[i]) {
            unique.removeAt(unique.size - 1)
        } else {
            unique.add(s[i])
        }
    }
    return unique.joinToString("")
}

fun main() {
    println(removeDuplicates("abbaca")) // "ca"
    println(removeDuplicates("azxxzy")) //  // "ay"
}