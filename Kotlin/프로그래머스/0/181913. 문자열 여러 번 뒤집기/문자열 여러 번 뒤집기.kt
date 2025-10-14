class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        for ((s, e) in queries) {
            answer = answer.substring(0, s) + answer.substring(s, e + 1).reversed() + answer.substring(e + 1)
        }
        return answer
    }
}