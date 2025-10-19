class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer = mutableListOf<IntArray>()
        for (i in (0 until (num_list.size / n))) {
            answer.add(num_list.toList().subList(i * n, i * n + n).toIntArray())
        }
        return answer.toTypedArray()
    }
}