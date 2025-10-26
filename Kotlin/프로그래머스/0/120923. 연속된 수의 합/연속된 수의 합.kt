class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var n = (((total * 2) / num) - num + 1) / 2
        var answer: IntArray = (n..n+num-1).toList().toIntArray()
        return answer
    }
}