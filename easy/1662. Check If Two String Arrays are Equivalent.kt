package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    var concat1 = ""
    for (word in word1) { concat1 += word }
    var concat2 = ""
    for (word in word2) { concat2 += word }
    return concat1 == concat2
}

fun main() {
    println(arrayStringsAreEqual( word1 = arrayOf("ab", "c"), word2 = arrayOf("a", "bc"))) // true
    println(arrayStringsAreEqual( word1 = arrayOf("a", "cb"), word2 = arrayOf("ab", "c"))) // false
    println(arrayStringsAreEqual( word1 = arrayOf("abc", "d", "defg"), word2 = arrayOf("abcddefg"))) // true
}