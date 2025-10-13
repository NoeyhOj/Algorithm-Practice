class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        var sufList = mutableListOf<String>()
        for (i in my_string.length downTo 0) {
            sufList.add(my_string.substring(i, my_string.length))
        }
        var answer: Int = if (sufList.count{ it == is_suffix } > 0) 1 else 0
        return answer
    }
}