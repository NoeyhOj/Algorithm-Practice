class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var num = num.toLong()
        if (num == 1L) {
            answer = 0   
        } else {
            while (true) {
                num = collatz(num)
                answer += 1
                if (num == 1L) {
                    break
                } 
                if (answer > 500) {
                    answer = -1
                    break
                }
            }   
        }
        return answer.toInt()
    }
}

fun collatz(n: Long): Long {
    if (n % 2L == 0L) {
        return n / 2L
    } else {
        return n * 3L + 1L
    }
}