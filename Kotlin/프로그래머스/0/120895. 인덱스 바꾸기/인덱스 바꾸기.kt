class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = my_string.substring(0, num1) + my_string.get(num2) + my_string.substring(num1 + 1, num2) + my_string.get(num1) + my_string.substring(num2 + 1)
        return answer
    }
}