class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = (left..right).toList().map {
            var row = it / n
            var column = it % n
            if (column <= row) {
                (row + 1).toInt()
            } else {
                (column + 1).toInt()
            }
        }.toIntArray()
        return answer
    }
}