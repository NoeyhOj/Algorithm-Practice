class Solution {
    fun solution(my_string: String): IntArray {
        val numberList = (0..9).toList().map{ it.toString() }
        var answer: IntArray = my_string.filter{ numberList.contains(it.toString()) }.toList().map{ it.toString().toInt() }.sorted().toIntArray()
        return answer
    }
}