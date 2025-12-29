class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arr1.toList().map { arr ->
            arr2[0].indices.map{ index -> 
                var arr2List = arr.indices.map{
                    arr2[it][index]
                }
                arr.toList().zip(arr2List) { item1, item2 -> item1 * item2}.sumOf{ it }
            }.toIntArray()
        }.toTypedArray()
        return answer
    }
}