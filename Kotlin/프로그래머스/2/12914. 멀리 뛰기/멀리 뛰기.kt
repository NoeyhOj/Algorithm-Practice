class Solution {
    fun solution(n: Int): Long {
        var dp = LongArray(n+1)
        dp[0] = 1L
        dp[1] = 1L
        for (i in 2..n) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567L
        }
        var answer: Long = dp.last()
        return answer
    }
}