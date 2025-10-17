class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = array.count{ it > height }
        return answer
    }
}