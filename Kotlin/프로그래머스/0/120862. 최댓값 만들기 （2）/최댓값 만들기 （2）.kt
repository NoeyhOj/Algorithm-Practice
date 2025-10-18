class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        for (i in (0..(numbers.size - 2))) {
            for (j in ((i + 1)..(numbers.size - 1))) {
                var num = numbers[i] * numbers[j]
                if (i == 0 && j == 1) {
                    answer = num
                } else {
                    if (answer < num) {
                        answer = num
                    }
                }
            }
        }
        return answer
    }
}