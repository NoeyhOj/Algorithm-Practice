class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        var answer: (Int, Int, Int)->Int = {number, n , m ->
            if (number % n == 0 && number % m == 0) 1 else 0
        }
        return answer(number, n, m)
    }
}