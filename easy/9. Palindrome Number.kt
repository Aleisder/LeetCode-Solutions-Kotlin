package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/palindrome-number/
 */

fun isPalindrome(x: Int) = x.toString() == x.toString().reversed()

fun main() {
    println(isPalindrome(121)) //true
    println(isPalindrome(-121)) //false
    println(isPalindrome(10)) //false
}