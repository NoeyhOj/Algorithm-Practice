class Solution {
    fun solution(citations: IntArray): Int {
        var citations = citations.sortedByDescending{ it }
        var answer: Int = 0
        for (i in citations.indices) {
            if (i + 1 <= citations[i]) answer = i + 1
            if (i + 1 > citations[i]) break
        }
        return answer
    }
}