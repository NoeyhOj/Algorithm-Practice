fun main() {
    val n = readln().toInt()
    repeat(n) {
        println(" ".repeat(it) + "*".repeat((n - it) * 2 - 1))
    }

    repeat(n - 1) {
        println(" ".repeat((n - 2) - it) + "*".repeat((it + 2) * 2 - 1))
    }
}