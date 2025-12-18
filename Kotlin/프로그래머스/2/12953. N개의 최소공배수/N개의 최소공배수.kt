class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr.sorted().last()
        while (true) {
            var sum = 0
            for (i in arr) sum += answer % i
            if (sum == 0) break
            answer++
        }
        return answer
    }
}