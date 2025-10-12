class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in n-1 until num_list.size) {
            answer.add(num_list[i])
        }
        return answer.toIntArray()
    }
}