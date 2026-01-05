fun main() {
    val n = readln().toInt()

    (1..n).toList().forEach { star ->
        println(" ".repeat(n - star) + "*".repeat(star))
    }

    (1 until n).reversed().forEach { star ->
        println(" ".repeat(n - star) + "*".repeat(star))
    }
}