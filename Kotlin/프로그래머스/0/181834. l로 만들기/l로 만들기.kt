class Solution {
    fun solution(myString: String): String {
        var answer: String = myString.map { if (it < 'l') 'l' else it }.joinToString("")
        return answer
    }
}