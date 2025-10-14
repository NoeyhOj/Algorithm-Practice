class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer = when(ineq) {
            "<" -> when(eq) {
                "=" -> n <= m
                else -> n < m
            }
            else -> when(eq) {
                "=" -> n >= m
                else -> n > m
            }
        }
        return if (answer) 1 else 0
    }
}