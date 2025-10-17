import kotlin.math.*

class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = ceil(n.toDouble() / slice).toInt()
        return answer
    }
}