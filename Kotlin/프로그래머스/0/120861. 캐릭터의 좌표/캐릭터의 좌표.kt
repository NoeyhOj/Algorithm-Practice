import kotlin.math.abs

class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        val sizeX = board[0] / 2
        val sizeY = board[1] / 2
        for (i in keyinput) {
            when (i) {
                "up" -> answer[1] += if (answer[1] < sizeY) 1 else 0
                "down" -> answer[1] -= if (answer[1] > -1 * sizeY) 1 else 0
                "left" -> answer[0] -= if (answer[0] > -1 * sizeX) 1 else 0
                else -> answer[0] += if (answer[0] < sizeX) 1 else 0
            }
        }
        return answer
    }
}