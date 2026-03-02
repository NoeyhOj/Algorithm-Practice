fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    when {
        x < y -> println("-1")
        x == y -> println("0")
        else -> println("1")
    }
}