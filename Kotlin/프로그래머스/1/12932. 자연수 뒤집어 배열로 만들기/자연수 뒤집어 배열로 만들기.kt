class Solution {
    fun solution(n: Long): IntArray {
        var answer = n.toString().toList().reversed().map{ it.digitToInt() }.toIntArray()
        return answer
    }
}