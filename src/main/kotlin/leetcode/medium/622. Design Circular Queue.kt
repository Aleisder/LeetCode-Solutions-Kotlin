package leetcode.medium

class MyCircularQueue(k: Int) {

    private val data: IntArray
    private var head: Int
    private var tail: Int
    private var size: Int

    init {
        data = IntArray(k)
        head = -1
        tail = -1
        size = k
    }

    fun enQueue(value: Int): Boolean {
        if (isFull()) { return false }
        if (isEmpty()) { head = 0 }
        tail = (tail + 1) % size
        data[tail] = value
        return true
    }

    fun deQueue(): Boolean {
        if (isEmpty()) { return false }
        if (head == tail) {
            head = -1
            tail = -1
            return true
        }
        head = (head + 1) % size
        return true
    }

    fun Front() = if (isEmpty()) -1 else data[head]

    fun Rear() = if (isEmpty()) -1 else data[tail]

    fun isEmpty() = head == -1

    fun isFull() = (tail + 1) % size == head

}

fun main() {
    val buffer = MyCircularQueue(3)
    println(buffer.enQueue(1)) //true
    println(buffer.enQueue(2)) //true
    println(buffer.enQueue(3)) //true
    println(buffer.enQueue(4)) //false
    println(buffer.Rear()) //3
    println(buffer.isFull()) //true
    println(buffer.deQueue()) //true
    println(buffer.enQueue(4)) //true
    println(buffer.Rear()) //4
}