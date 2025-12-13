class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = (0..9).toList().filter{ !numbers.contains(it) }.sumOf{ it }
        return answer
    }
}