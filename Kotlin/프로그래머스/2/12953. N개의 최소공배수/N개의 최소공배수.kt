class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr.sorted().last()
        while (true) {
            for (i in arr.sorted()) {
                if (answer % i != 0) {
                    answer++
                    break
                } else {
                    if (i == arr.sorted().last() && answer % i == 0) {
                        return answer
                    }
                }
            }
        }
        return answer
    }
}