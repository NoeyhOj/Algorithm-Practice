class Solution {
    fun solution(s: String): String {
        var answer: String = ""
        for (i in s.toMutableList().sorted().distinct()) {
            if (s.count{ it == i } == 1) {
                answer += i
            }
        }
        return answer
    }
}