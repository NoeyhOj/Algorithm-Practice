class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var scores = mutableListOf<Int>()
        score.forEach{ score ->
            scores.add(score)
            scores.sortByDescending{ it }
            answer.add(if(scores.size < k) scores.last() else scores[k - 1])
        }
        return answer.toIntArray()
    }
}