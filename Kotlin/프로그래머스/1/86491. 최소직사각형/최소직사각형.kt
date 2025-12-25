class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var newSizes = sizes.map{ it.sorted() }
        var a = newSizes.map{ it[0] }.maxOf{ it }
        var b = newSizes.map{ it[1] }.maxOf{ it }
        var answer: Int = a * b
        return answer
    }
}