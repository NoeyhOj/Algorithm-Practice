fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    var basket = (1..n).toList()
    repeat(m) {
        val (i, j) = readln().split(" ").map{ it.toInt() }
        basket = basket.subList(0, i - 1) + basket.subList(i-1, j).reversed() + basket.subList(j, n)
    }
    println(basket.joinToString(" "))
}
