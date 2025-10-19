class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = when (direction) {
            "left" -> numbers.toList().subList(1, numbers.size) + listOf(numbers[0])
            else -> listOf(numbers.last()) + numbers.toList().subList(0, (numbers.size - 1))
        }.toIntArray()
        return answer
    }
}