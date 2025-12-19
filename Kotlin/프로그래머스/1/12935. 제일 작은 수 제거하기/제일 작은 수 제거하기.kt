class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = if (arr.size == 1) listOf(-1) else arr.filter{ it != arr.minOf{ it } }
        return answer.toIntArray()
    }
}