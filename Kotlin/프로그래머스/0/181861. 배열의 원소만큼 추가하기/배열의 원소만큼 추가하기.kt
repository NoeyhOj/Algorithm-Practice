class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for (i in arr) {
            for (j in 1..i) {
                answer += i
            }
        }
        return answer.toIntArray()
    }
}