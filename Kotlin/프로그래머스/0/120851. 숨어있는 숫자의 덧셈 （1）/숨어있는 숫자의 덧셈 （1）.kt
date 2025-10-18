class Solution {
    fun solution(my_string: String): Int {
        val numbers_list = (0..9).toList().map{ it.toString() }
        var answer: Int = my_string.filter{ numbers_list.contains(it.toString()) }.map{ it.toString().toInt() }.sumOf{ it }
        return answer
    }
}