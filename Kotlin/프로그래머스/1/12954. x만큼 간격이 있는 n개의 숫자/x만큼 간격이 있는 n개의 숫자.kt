class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = (1..n).map{ it.toLong() * x }.toLongArray()
        return answer
    }
}