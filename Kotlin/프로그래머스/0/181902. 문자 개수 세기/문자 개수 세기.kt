class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = List(52) { 0 }.toIntArray()
        for (i in my_string) {
            if (i.isUpperCase()) answer[i.toInt() - 65] += 1 else answer[i.toInt() - 65 - 6] += 1
        }
        return answer
    }
}