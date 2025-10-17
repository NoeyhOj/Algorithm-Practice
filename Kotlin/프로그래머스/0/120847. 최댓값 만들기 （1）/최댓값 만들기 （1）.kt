class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = numbers.sorted().subList(numbers.size - 2, numbers.size).reduce{ acc, i -> acc * i}
        return answer
    }
}