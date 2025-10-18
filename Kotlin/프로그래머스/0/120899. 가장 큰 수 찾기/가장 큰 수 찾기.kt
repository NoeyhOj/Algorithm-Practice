class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf(array.maxOf{ it }, array.indexOf(array.maxOf{ it }))
        return answer
    }
}