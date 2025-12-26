class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var num: Int = (1..n).filter{ n % it == 0 }.sortedByDescending{ it }.find{  
            var mList = (1..m).filter{ m % it == 0 }.sortedByDescending{ it }
            mList.contains(it)
        } ?: 0
        var answer = intArrayOf(num, n * m / num)
        return answer
    }
}