class Solution {
    fun solution(num_list: IntArray): IntArray {
        val evenCount = num_list.toList().filter{ it % 2 == 0 }.size
        var answer: IntArray = intArrayOf(evenCount, num_list.size - evenCount)
        return answer
    }
}