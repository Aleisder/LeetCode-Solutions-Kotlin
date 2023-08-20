package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

fun reverseVowels(s: String): String {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var l = 0 ; var r = s.length - 1
    val text = s.toCharArray()
    while (r > l) {
        if (vowels.containsAll(listOf(text[l],text[r]) )) {
            val leftVowel = text[l]
            text[l] = text[r]; text[r] = leftVowel
            l++; r--
        }
        if (!vowels.contains(text[l])) l++
        if (!vowels.contains(text[r])) r--
    }
    var answer = ""
    text.forEach { answer += it }
    return answer
}

fun main() {
    println(reverseVowels("hello")) // "holle"
    println(reverseVowels("leetcode")) // "leotcede"
}