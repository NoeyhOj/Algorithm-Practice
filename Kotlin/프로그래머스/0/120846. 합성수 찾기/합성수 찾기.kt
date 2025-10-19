class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 3..n) {
            var nList = mutableListOf<Int>()
            for (j in 1..i) {
                if (i % j == 0) {
                    nList.add(j)
                }
            }
            if (nList.size >= 3) answer += 1
        }
        return answer
    }
}