fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    val basket = (1..n).toMutableList()
    repeat(m) {
        val (i, j) = readln().split(" ").map{ it.toInt() }
        val iValue = basket[i - 1]
        val jValue = basket[j - 1]
        basket[i - 1] = jValue
        basket[j - 1] = iValue
    }
    println(basket.joinToString(" "))
}
