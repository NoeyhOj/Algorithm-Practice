class Solution {
    fun solution(s: String): Boolean {
        var answer = Regex("^\\d+$").matches(s) && (s.length == 4 || s.length == 6)
        return answer
    }
}