class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        for ((s, e) in queries) {
            var dumy = 0
            dumy = answer[s]
            answer[s] = answer[e]
            answer[e] = dumy
        }
        return answer
    }
}