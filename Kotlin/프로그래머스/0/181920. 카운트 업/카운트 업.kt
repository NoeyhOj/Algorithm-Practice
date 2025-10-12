class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = IntArray(end_num - start_num + 1) { it + start_num }
        return answer
    }
}