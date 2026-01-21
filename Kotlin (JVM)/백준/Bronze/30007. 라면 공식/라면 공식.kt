fun main() {
    repeat(readln().toInt()) {
        val (a, b, x) = readln().split(" ").map{ it.toInt() }
        println(a * (x - 1) + b)
    }
}