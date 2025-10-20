class Solution {
    fun solution(numbers: String): Long {
        var nMap = mapOf("zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)
        var answer: String = numbers
        for ((key, value) in nMap) {
            answer = answer.replace(key, value.toString())
        }
        return answer.toLong()
    }
}