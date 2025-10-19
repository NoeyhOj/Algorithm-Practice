class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        var result = 1
        while(true) {
            result *= answer
            if (result >= n) {
                break
            }
            answer += 1
        }
        return if (result > n) answer - 1 else answer
    }
}