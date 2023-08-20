package leetcode.medium

fun reverseWords(s: String): String {
    val words = s.trim().split(""" +""".toRegex())
    return words.reversed().joinToString(" ")
}

fun main() {
    println(reverseWords("the sky is blue")) // "blue is sky the"
    println(reverseWords("  hello world  ")) // "world hello"
    println(reverseWords("a good   example")) // "example good a"
}