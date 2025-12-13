class Solution {
    fun solution(x: Int): Boolean {
        var answer = x % x.toString().toList().fold(0) { total, num -> total + num.digitToInt() } == 0
        return answer
    }
}