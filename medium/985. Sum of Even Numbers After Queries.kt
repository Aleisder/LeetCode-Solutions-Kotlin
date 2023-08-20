package leetcode.medium

/*
 * Task from LeetCode: https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */

fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
    var sum = nums.filter { it % 2 == 0 }.sum()
    val answer = IntArray(queries.size)
    for (query in queries) {
        val value = query[0]
        val index = query[1]

        if (nums[index] % 2 == 0) { sum -= nums[index] }
        nums[index] += value
        if (nums[index] % 2 == 0) { sum += nums[index] }

        answer[queries.indexOf(query)] = sum
    }
    return answer
}

fun main() {
    println(
        sumEvenAfterQueries(
            nums = intArrayOf(1, 2, 3, 4),
            queries = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(-3, 1),
                intArrayOf(-4, 0),
                intArrayOf(2, 3)
            )
        ).toList()
    ) //[8,6,2,4]

    println(
        sumEvenAfterQueries(
            nums = intArrayOf(1),
            queries = arrayOf(
                intArrayOf(4, 0),
            )
        ).toList()
    ) //[0]
}