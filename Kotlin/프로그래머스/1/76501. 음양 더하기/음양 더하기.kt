class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = absolutes.indices.sumOf{ if (signs[it]) absolutes[it] else absolutes[it] * -1}
        return answer
    }
}