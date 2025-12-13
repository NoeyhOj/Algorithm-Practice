class Solution {
    fun solution(n: Long): Long {
        var answer: Long = n.toString().toList().sortedDescending().joinToString("").toLong()
        return answer
    }
}