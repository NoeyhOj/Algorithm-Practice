import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = (2..n).filter{ n % it == 0 }.filter{ num -> 
            (1..num).filter{ num % it == 0 }.size == 2 }.toIntArray()
        return answer
    }
}