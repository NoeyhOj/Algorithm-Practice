fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    var result = n * 10
    if (n >= 3) result += 20
    if (n == 5) result += 50
    if (m > 1000) result -= 15
    println(maxOf(0, result))
}