class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var avgScore = score.map{ it.sumOf{ it } }
        var sortedScore = avgScore.sorted().reversed()
        var pMap = mutableMapOf<Int, Int>()
        for (i in avgScore) {
            pMap.put(i, sortedScore.indexOf(i) + 1)
        }
        var answer: IntArray = avgScore.map{ pMap[it] ?: 0 }.toIntArray()
        return answer
    }
}