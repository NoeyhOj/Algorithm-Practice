class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = numbers.sumOf{ it }.toDouble() / numbers.size
        return answer
    }
}