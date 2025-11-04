import kotlin.math.pow

class Solution {
    fun solution(s: String): Int {
        var answer = 0
        var number = ""
        if (s[0] == '-') {
            number = s.substring(1)
            answer = -1 * stringToInt(number)
        } else {
            if (s[0] == '+') {
                number = s.substring(1)
            } else {
                number = s
            }
            answer = stringToInt(number)
        }
        
        return answer
    }
    
    fun stringToInt(number: String): Int {
        val numberList = number.map{ it.digitToInt() }
        return numberList.indices.map{ numberList[it] * 10.0.pow((numberList.size - it - 1)) }.sumOf { it }.toInt()
    }
}