class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()
        for (i in (0..numbers.size - 2)) {
            for (j in ((i+1)..numbers.size - 1)) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        return answer.toList().sorted().toIntArray()
    }
}