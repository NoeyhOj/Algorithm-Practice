class Solution {
    var answer: Int = 0
    var result: Int = 0
    fun solution(k: Int, tangerine: IntArray): Int {
        var mikan = mutableMapOf<Int, Int>()
        for (i in tangerine.toSet()) {
            mikan[i] = tangerine.count{ it == i } 
        }
        var mikanSort = mikan.keys.sortedByDescending{ mikan[it] }
        for (j in mikanSort.indices) {
            result += mikan[mikanSort[j]] ?: 0
            if (result >= k) {
                answer = j + 1
                break
            }
        }
        return answer
    }
}