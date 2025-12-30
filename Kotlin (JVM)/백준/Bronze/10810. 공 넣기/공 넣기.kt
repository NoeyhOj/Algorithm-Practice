fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    var basket = MutableList(n) { 0 }
    repeat(m) {
        val (i, j, k) = readln().split(" ").map{ it.toInt() }
        for(num in (i-1)until j) {
            basket[num] = k
        }
    }
    println(basket.joinToString(" "))
}