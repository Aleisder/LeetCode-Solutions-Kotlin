/*
 * https://leetcode.com/problems/valid-palindrome/description/
 */

class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l <= r) {
            if (!s[l].isLetterOrDigit())
                l++
            else if (!s[r].isLetterOrDigit())
                r--
            else {
                if (s[l].toLowerCase() != s[r].toLowerCase())
                    return false
                l++
                r--
            }
        }
        return true;
    }
}
