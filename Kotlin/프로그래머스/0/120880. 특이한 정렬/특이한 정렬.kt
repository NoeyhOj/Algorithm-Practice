import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var nMap = mutableMapOf<Int, Int>()
        for (num in numlist) {
            nMap[num] = abs(num - n)
        }
        var sortednList = nMap.toList().sortedBy{ it.first }.reversed().sortedBy{ it.second }
        var answer: IntArray = sortednList.map{ it.first }.toIntArray()
        return answer
    }
}