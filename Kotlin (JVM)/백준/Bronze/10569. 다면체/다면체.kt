fun main() {
    repeat(readln().toInt()) {
        val (v, e) = readln().split(" ").map{ it.toInt() }
        println(2 - v + e)
    }
}