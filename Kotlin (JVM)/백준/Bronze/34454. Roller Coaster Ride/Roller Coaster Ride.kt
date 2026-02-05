fun main() {
    val n = readln().toInt()
    val c = readln().toInt()
    val p = readln().toInt()
    println(if (n > c * p) "no" else "yes")
}