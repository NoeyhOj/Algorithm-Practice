class Solution {
    fun solution(num_list: IntArray): Int {
        var num: Int = 1
        var a = (num_list.sum() * num_list.sum())
        num_list.forEach{ num *= it }
        var answer: Int = if (a > num) 1 else 0
        return answer
    }
}