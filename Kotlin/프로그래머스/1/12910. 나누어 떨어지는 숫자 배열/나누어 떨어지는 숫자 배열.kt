class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter{ it % divisor == 0 }.sorted().toIntArray()
        return if (!answer.isEmpty()) answer else intArrayOf(-1)
    }
}