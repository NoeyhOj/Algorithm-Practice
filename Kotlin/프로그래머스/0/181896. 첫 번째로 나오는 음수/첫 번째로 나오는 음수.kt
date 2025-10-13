class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = if (num_list.all{ it >= 0 }) -1 else num_list.indexOf(num_list.first{ it < 0 })
        return answer
    }
}