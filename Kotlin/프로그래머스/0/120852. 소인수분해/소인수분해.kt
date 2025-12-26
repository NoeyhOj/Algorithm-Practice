import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = (2..n).filter{ n % it == 0 && isPrime(it) }.toIntArray()
        return answer
    }
    
    fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
}