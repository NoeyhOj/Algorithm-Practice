class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = (1..count).fold(0L) { acc, i -> acc + (price.toLong() * i.toLong()) }.let { if (it <= money.toLong()) 0L else it - money.toLong() }
        return answer
    }
}