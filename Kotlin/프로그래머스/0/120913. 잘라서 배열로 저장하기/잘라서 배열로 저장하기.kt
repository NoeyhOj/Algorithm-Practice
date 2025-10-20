class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = my_str.chunked(n).toTypedArray()
        return answer
    }
}