class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val totalPrice = (1..count).fold(0L) { acc, i -> acc + (price.toLong() * i.toLong()) }
        var answer: Long = if (totalPrice <= money.toLong()) 0L else totalPrice - money.toLong()
        return answer
    }
}