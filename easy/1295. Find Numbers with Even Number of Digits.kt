package leetcode.easy

private fun findNumbers(nums: IntArray): Int {
    var count = 0
    nums.forEach {
        if (it.toString().length % 2 == 0) {
            count++
        }
    }
    return count
}

fun main() {
    var nums = intArrayOf(12, 345, 2, 6, 7896) // 2
    println(findNumbers(nums))

    nums = intArrayOf(555, 901, 482, 1771)
    println(findNumbers(nums)) // 1
}
