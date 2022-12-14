package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/unique-morse-code-words/
 */

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val morseCode = hashMapOf(
        'a' to ".-",
        'b' to "-...",
        'c' to "-.-.",
        'd' to "-..",
        'e' to ".",
        'f' to "..-.",
        'g' to "--.",
        'h' to "....",
        'i' to "..",
        'j' to ".---",
        'k' to "-.-",
        'l' to ".-..",
        'm' to "--",
        'n' to "-.",
        'o' to "---",
        'p' to ".--.",
        'q' to "--.-",
        'r' to ".-.",
        's' to "...",
        't' to "-",
        'u' to "..-",
        'v' to "...-",
        'w' to ".--",
        'x' to "-..-",
        'y' to "-.--",
        'z' to "--.."
    )
    val wordsInMorse = mutableListOf<String>()
    for (word in words) {
        var wordInMorse = ""
        val letters = word.toCharArray()
        for (letter in letters) {
            wordInMorse += morseCode[letter]
        }
        wordsInMorse.add(wordInMorse)
    }
    return wordsInMorse.toSet().size
}

fun main() {
    println(uniqueMorseRepresentations(arrayOf("gin","zen","gig","msg"))) //2
    println(uniqueMorseRepresentations(arrayOf("a"))) //1
}