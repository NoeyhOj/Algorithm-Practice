class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        if (s + overwrite_string.length > my_string.length) {
            answer = my_string.substring(0, s) + overwrite_string
        } else {
            answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length, my_string.length)
        }
        return answer
    }
}