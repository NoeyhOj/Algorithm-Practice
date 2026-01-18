fun main() {
    val (a, b, c) = readln().split(" ").map{ it.toLong() }
    if (b >= c) {
        println(-1)
    } else {
        println(a / (c - b) + 1)
    }
}