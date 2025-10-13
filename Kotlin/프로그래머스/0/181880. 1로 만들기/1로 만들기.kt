class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = num_list.map {
            var num = it
            var count = 0
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2
                } else {
                    num = (num - 1) / 2
                }
                count += 1
            }
            count
        }.sum()
        
        return answer
    }
}