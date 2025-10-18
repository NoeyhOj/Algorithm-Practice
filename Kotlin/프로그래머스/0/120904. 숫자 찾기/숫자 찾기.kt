class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = if (num.toString().contains(k.toString())) num.toString().indexOf(k.toString()) + 1 else -1
        return answer
    }
}