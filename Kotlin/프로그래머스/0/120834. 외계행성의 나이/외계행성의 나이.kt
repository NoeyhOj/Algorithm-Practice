class Solution {
    fun solution(age: Int): String {
        var answer: String = age.toString().map{ 'a' + it.digitToInt() }.joinToString("")
        return answer
    }
}