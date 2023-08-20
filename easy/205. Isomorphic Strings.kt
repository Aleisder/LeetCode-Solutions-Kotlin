package leetcode.easy

/*
 * Task from LeetCode: https://leetcode.com/problems/isomorphic-strings/
 */

fun isIsomorphic(s: String, t: String): Boolean {
    val mapStoT = mutableMapOf<Char, Char>()
    val mapTtoS = mutableMapOf<Char, Char>()
    for (i in s.indices) {
        val s1 = s[i]
        val t1 = t[i]

        if (mapStoT.contains(s1) || mapTtoS.contains(t1)) {
            if (mapStoT[s1] != t1 || mapTtoS[t1] != s1) {
                return false
            }
        }
        mapStoT[s1] = t1
        mapTtoS[t1] = s1
    }
    return true
}

fun main() {
    println(isIsomorphic(s = "egg", t = "add")) // true
    println(isIsomorphic(s = "foo", t = "bar")) // false
    println(isIsomorphic(s = "paper", t = "title")) // true
}

