class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = if (arr.slice(idx..arr.size-1).count{ it == 1 } > 0) arr.slice(idx..arr.size-1).indexOf(1) + idx else -1
        return answer
    }
}