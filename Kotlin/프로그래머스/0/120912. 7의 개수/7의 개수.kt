class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = array.map{ it.toString().count{ it == '7' } }.sumOf{ it }
        return answer
    }
}