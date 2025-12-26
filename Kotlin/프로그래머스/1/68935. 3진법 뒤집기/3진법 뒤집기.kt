import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var three: String = ""
        var num: Int = n
        while (num != 0) {
            three += (num % 3).toString()
            num /= 3
        }
        three = three.reversed()
        for (i in three.indices) {
            answer += (3.0.pow(i) * three[i].digitToInt()).toInt()
        }
        return answer
    }
}