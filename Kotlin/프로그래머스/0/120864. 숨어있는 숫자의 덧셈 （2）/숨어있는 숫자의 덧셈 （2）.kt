class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = my_string.split(Regex("[a-zA-Z]")).filter{ it != "" }.map{ it.toInt() }.sumOf{ it }
        return answer
    }
}