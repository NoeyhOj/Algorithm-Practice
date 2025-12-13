import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.roundToInt

class Solution {
    fun solution(n: Long): Long {
        val sqr = sqrt(n.toDouble()).roundToInt().toDouble()
        var answer: Long = if (sqr.pow(2) == n.toDouble()) (sqr+1).pow(2).toLong() else -1.toLong()
        return answer
    }
}