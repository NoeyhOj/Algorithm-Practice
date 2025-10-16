class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = arr.toSet().toList()
        if (answer.size > k) {
            answer = answer.subList(0, k)
        } else {
            for (i in answer.size..k - 1) {
                answer += -1
            }
        }
        return answer.toIntArray()
    }
}