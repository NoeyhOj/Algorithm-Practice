class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = numbers.reduce{ acc, i -> if (acc <= n) acc + i else acc}
        return answer
    }
}