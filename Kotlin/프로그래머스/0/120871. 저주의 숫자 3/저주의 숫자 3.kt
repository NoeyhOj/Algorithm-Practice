class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var i = 0
        while (i != n) {
            if (answer % 3 == 0 || answer.toString().contains('3')) {
                answer += 1
            } else {
                answer += 1
                i += 1
            }
        }
        return answer - 1
    }
}