class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = queries.map{ 
            var result = mutableListOf<Int>()
            for (i in it[0]..it[1]) {
                if (arr[i] > it[2]) {
                    result.add(arr[i])
                }
            }
            if (result.isEmpty()) -1 else result.minOf{ it }
        }.toIntArray()
        return answer
    }
}