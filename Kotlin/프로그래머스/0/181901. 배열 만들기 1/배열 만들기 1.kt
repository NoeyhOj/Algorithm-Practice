class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = (k..n step k).toList().toIntArray()
        return answer
    }
}