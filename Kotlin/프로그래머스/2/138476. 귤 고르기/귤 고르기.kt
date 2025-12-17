class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var sum: Int = 0
        tangerine.groupBy{ it }.toList().sortedByDescending{ it.second.size }.forEach{
            if (sum >= k) {
                return answer
            }
            sum += it.second.size
            answer++
        }
        return answer
    }
}