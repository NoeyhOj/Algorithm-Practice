fun main() {
    val (a, b, c) = readln().split(" ").map{ it.toInt() }
    val maxLength = maxOf(a, b, c)
    val otherSum = a + b + c - maxLength

    if (maxLength >= otherSum) {
        println(otherSum * 2 - 1)
    } else {
        println(maxLength + otherSum)
    }
}