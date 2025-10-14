class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk = mutableListOf<Int>()
        var i = 0
        while (i < arr.size) {
            var lst = stk.lastOrNull()
            if (lst == null || lst < arr[i]) {
                stk.add(arr[i])
                i += 1
            } else {
                stk.removeLast()
            }
        }
        return stk.toIntArray()
    }
}