class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var a1 = intervals[0][0].toInt()
        var b1 = intervals[0][1].toInt()
        var a2 = intervals[1][0].toInt()
        var b2 = intervals[1][1].toInt()
        var answer: IntArray = (arr.slice(a1..b1) + arr.slice(a2..b2)).toIntArray()
        return answer
    }
}