class Solution {
    fun solution(s: String): String {
        var answer = s.split(" ").map{ it.toLowerCase().capitalize() }.joinToString(" ")
        return answer
    }
}