class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = (i..j).toList().map{ it.toString().count{ it.toString() == k.toString() } }.sumOf{ it }
        return answer
    }
}