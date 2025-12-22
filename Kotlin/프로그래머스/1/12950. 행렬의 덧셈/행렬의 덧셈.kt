class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arr1.indices.map {
            var newList = mutableListOf<Int>()
            for (i in arr1[it].indices) {
                newList.add(arr1[it][i] + arr2[it][i])
            }
            newList.toIntArray()
        }.toTypedArray()
        return answer
    }
}