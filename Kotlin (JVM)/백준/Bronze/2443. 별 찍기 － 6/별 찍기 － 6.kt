fun main() {
    val num = readln().toInt()
    (0 until num).toList().forEach { n ->
        println(" ".repeat(n) + "*".repeat((num - n) * 2  - 1))
    }
}