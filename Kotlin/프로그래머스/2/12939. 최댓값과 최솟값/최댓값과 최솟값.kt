class Solution {
    fun solution(s: String): String {
        val numList = s.split(" ").map{ it.toInt() }
        val maxNum = numList.maxOf{ it }
        val minNum = numList.minOf{ it }
        var answer = "${minNum} ${maxNum}"
        return answer
    }
}