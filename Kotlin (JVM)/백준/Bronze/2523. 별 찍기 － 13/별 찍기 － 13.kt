fun main() {
    val n = readln().toInt()

    (1..n).forEach {
        println("*".repeat(it))
    }
    (1 until n).reversed().forEach {
        println("*".repeat(it))
    }
}