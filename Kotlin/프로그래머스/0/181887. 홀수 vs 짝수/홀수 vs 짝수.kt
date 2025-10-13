class Solution {
    fun solution(num_list: IntArray): Int {
        var even = 0
        var odd = 0
        num_list.indices.forEach{ if(it % 2 == 0) odd += num_list[it] else even += num_list[it]}
        var answer: Int = maxOf(even, odd)
        return answer
    }
}