class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        var num = 1
        while (num < answer.size) {
            num *= 2
        }
        for (i in 1..num - answer.size) {
            answer.add(0)
        }
        return answer.toIntArray()
    }
}