class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n.toString().toList().map{ it.digitToInt() }.sumOf{ it }
        return answer
    }
}