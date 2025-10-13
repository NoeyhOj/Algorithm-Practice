class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = mutableListOf<String>()
        for (i in my_string.length downTo 1) {
            answer.add(my_string.substring(i - 1, my_string.length))
        }
        return answer.sorted().toTypedArray()
    }
}