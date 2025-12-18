import kotlin.math.roundToInt
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var num1 = min(a, b)
        var num2 = max(a, b)
        for (i in 1..second(n)) {
            if (num2 - num1 == 1 && num2 % 2 == 0) {
                answer = i
                break
            }
            num1 = (num1 + 1) / 2
            num2 = (num2 + 1) / 2
        }

        return answer
    }
}

fun second(n: Int): Int {
    var num = n
    var result = 0
    while (true) {
        if (num / 2 == 0) {
            break
        } else {
            num /= 2
            result++
        }
    }
    return result
}