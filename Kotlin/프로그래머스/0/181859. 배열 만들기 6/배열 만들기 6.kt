class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for (i in arr) {
            var last = answer.lastOrNull() 
            if (last == null) {
                answer.add(i)
            } else if (last == i) {
                answer.removeLast()
            } else {
                answer.add(i)
            }
        }
        return if (answer.isNotEmpty()) answer.toIntArray() else intArrayOf(-1)
    }
}