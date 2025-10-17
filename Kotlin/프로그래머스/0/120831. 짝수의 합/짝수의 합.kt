class Solution {
    fun solution(n: Int): Int {
        var answer: Int = (0..n step 2).toList().sumOf{ it }
        return answer
    }
}