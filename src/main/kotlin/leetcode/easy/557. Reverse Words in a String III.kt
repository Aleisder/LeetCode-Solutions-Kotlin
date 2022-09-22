package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */

fun reverseWords(s: String): String {
    val words = mutableListOf<String>()
    for (word in s.split(" ")) {
        words.add(word.reversed())
    }
    return words.joinToString(separator = " ")
}

fun main() {
    println(reverseWords("Let's take LeetCode contest")) // "s'teL ekat edoCteeL tsetnoc"
    println(reverseWords("God Ding")) // "doG gniD"
}