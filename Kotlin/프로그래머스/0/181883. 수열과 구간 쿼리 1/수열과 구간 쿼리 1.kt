class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = arr
        for ((a, b) in queries) {
            for (i in a..b) {
                answer[i] += 1
            }
        }
        return answer
    }
}