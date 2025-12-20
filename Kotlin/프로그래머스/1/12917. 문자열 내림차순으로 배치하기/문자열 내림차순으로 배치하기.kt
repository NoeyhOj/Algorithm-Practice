class Solution {
    fun solution(s: String): String {
        var answer = s.toList().sortedByDescending{ it }.joinToString("")
        return answer
    }
}