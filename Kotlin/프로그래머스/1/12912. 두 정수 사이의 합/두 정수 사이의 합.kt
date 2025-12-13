class Solution {
    fun solution(a: Int, b: Int): Long {
        val min = minOf(a, b)
        val max = maxOf(a, b)
        var answer: Long = (min..max).sumOf{ it.toLong() }
        return answer
    }
}