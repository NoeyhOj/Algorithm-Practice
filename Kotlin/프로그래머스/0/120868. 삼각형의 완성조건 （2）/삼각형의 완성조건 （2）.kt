class Solution {
    fun solution(sides: IntArray): Int {
        val maxN = sides.toList().maxOf{ it }
        val minN = sides.toList().minOf{ it }
        var answer: Int = 2 * minN - 1
        return answer
    }
}