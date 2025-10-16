class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = (l..r).toList().filter{ it.toString().all{ it == '0' || it == '5'} }.toIntArray()
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}