class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        for (i in quiz) {
            var n = i.split(" ")
            var m = when (n[1]) {
                "+" -> n[0].toInt() + n[2].toInt()
                else -> n[0].toInt() - n[2].toInt()
            }
            if (m == n[4].toInt()) {
                answer += "O"
            } else {
                answer += "X"
            }
        }
        return answer.toTypedArray()
    }
}