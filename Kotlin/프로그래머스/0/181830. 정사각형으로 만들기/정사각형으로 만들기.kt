class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val n = maxOf(arr.size, arr.map{ it.size }.maxOf{ it })
        var answer = MutableList<IntArray>(n) { List(n) { 0 }.toIntArray() }
        for (i in arr.indices) {
            for (j in arr[i].indices) {
                if (arr[i][j] > 0) {
                    answer[i][j] = arr[i][j]
                }
            }
        }
        
        return answer.toTypedArray()
    }
}