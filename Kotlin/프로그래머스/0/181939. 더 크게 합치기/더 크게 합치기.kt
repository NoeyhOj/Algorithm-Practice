class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = maxOf((a.toString() + b.toString()).toInt(), (b.toString() + a.toString()).toInt())
        return answer
    }
}