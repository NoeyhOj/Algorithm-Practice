class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = array.count{ it == n }
        return answer
    }
}