class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        val n = A.length
        for (i in 0..n-1) {
            if (A.substring(n-i) + A.substring(0, n-i) == B) {
                break
            } else {
                answer += 1
            }
        }
        return if (answer == n) -1 else answer
    }
}