class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        for (i in flag.indices) {
            if (flag[i]) {
                for (j in 1..arr[i]*2) {
                    answer.add(arr[i])
                }
            } else {
                answer = answer.subList(0, answer.size - arr[i])
            }
        }
        return answer.toIntArray()
    }
}