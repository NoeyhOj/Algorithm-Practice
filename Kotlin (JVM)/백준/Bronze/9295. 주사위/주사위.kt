fun main() {
    (1..readln().toInt()).forEach {
        println("Case $it: ${readln().split(" ").sumOf{ it.toInt() }}")
    }
}