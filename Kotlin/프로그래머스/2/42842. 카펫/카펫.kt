import kotlin.math.sqrt
class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        var ext = (brown + yellow).toDouble()
        for (i in 1..sqrt(ext).toInt()) {
            if (ext % i == 0.0) {
                if ((i - 2) * (ext / i - 2) == yellow.toDouble()) {
                    answer = listOf(i, (ext / i).toInt()).sortedDescending().toIntArray()
                }
            }
        }
        
        return answer
    }
}