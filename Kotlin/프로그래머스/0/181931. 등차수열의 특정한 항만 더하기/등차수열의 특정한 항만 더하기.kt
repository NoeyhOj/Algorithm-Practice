class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var asList = mutableListOf<Int>()
        for (i in 1..included.size) {
            asList.add(a + (i - 1) * d)
        }
        var answer: Int = 0
        included.indices.forEach{ if(included[it]) answer += asList[it] }
        return answer
    }
}