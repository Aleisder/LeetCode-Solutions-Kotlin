package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */

fun checkIfPangram(sentence: String) = sentence.toSet() == ('a'..'z').toSet()

fun main() {
    println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog")) // true
    println(checkIfPangram("leetcode")) // false)
}