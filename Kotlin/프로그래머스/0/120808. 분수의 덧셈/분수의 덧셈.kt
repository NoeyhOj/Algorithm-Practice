class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var result1 = (numer1*denom2 + numer2*denom1) // 분자
        var result2 = (denom1*denom2) // 분모
        var gcd1 = gcd(result1, result2)
        var answer: IntArray = listOf(result1, result2).map{ it / gcd1 }.toIntArray()
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}