class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val maxX = dots.maxOf{ it[0] }
        val minX = dots.minOf{ it[0] }
        val maxY = dots.maxOf{ it[1] }
        val minY = dots.minOf{ it[1] }
        var answer: Int = (maxX - minX) * (maxY - minY)
        return answer
    }
}