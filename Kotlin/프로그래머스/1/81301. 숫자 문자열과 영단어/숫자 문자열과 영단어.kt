class Solution {
    fun solution(s: String): Int {
        var answer: String = s
        var numbers = mapOf<String, Int>(
            "zero" to 0, 
            "one" to 1, 
            "two" to 2, 
            "three" to 3, 
            "four" to 4, 
            "five" to 5, 
            "six" to 6, 
            "seven" to 7, 
            "eight" to 8, 
            "nine" to 9
        )
        numbers.keys.forEach{ num ->
            if (answer.contains(num)) {
                while (answer.contains(num)) {
                    answer = answer.substring(0 until answer.indexOf(num)) + numbers[num].toString() + answer.substring(answer.indexOf(num)+num.length until answer.length)
                }
            }
        }
        return answer.toInt()
    }
}