class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n.toString().toList().map{ it.toString().toInt() }.sumOf{ it }
        return answer
    }
}