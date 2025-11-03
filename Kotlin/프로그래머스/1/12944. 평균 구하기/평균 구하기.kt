class Solution {
    fun solution(arr: IntArray): Double {
        var answer = arr.toList().sumOf{ it }.toDouble() / arr.size
        return answer
    }
}