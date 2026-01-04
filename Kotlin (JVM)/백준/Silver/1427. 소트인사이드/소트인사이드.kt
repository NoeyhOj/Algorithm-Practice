fun main() {
    val input = readln()
    println(input.toList().sortedByDescending{ it }.joinToString(""))
}