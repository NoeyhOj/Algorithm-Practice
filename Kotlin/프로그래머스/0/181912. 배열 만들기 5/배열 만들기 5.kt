class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intStrs.map{ it.substring(s until s + l).toInt() }.filter{ it > k }.toIntArray()
        return answer
    }
}