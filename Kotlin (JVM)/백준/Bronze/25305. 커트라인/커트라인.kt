fun main() {
    val (n, k) = readln().split(" ").map{ it.toInt() }
    println(readln().split(" ").map{ it.toInt() }.sortedByDescending { it }.let{ it[k - 1] })
}