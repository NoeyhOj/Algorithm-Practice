import java.math.BigInteger

class Solution {
    fun solution(a: String, b: String): String {
        var answer = BigInteger(a) + BigInteger(b)
        return answer.toString()
    }
}