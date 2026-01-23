fun main() {
    val n = readln().toLong()
    if (n * n <= 100_000_000) {
        println("Accepted")
    } else {
        println("Time limit exceeded")
    }
}