fun main() {
    val n = readln().toInt()
    for(i in 1..n) {
        println(" ".repeat(n - i) + "*".repeat(2 * i - 1))
    }
    for(j in 1 until n) {
        println(" ".repeat(j) + "*".repeat(2 * (n - j) - 1))
    }
}