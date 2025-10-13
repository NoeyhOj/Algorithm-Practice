class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = when(n) {
            1 -> num_list.toList().slice(0..slicer[1])
            2 -> num_list.toList().slice(slicer[0]..num_list.size - 1)
            3 -> num_list.toList().slice(slicer[0]..slicer[1])
            else -> num_list.toList().slice(slicer[0]..slicer[1] step slicer[2])
        }.toIntArray()
        return answer
    }
}