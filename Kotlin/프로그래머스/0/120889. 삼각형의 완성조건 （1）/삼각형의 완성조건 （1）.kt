class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = if (sides.maxOf{ it } < sides.sumOf{ it } - sides.maxOf{ it }) 1 else 2
        return answer
    }
}