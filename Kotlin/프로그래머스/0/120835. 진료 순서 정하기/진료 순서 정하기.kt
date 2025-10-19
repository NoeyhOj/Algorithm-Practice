class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = emergency.toList().map{ emergency.sorted().reversed().indexOf(it) + 1 }.toIntArray()
        return answer
    }
}