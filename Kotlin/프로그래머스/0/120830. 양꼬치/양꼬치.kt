class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = when {
            n / 10 == 0 -> n * 12000 + k * 2000
            else -> n * 12000 + (k - (n / 10)) * 2000
        }
        return answer
    }
}