class Solution {
    fun solution(array: IntArray): Int {
        var numlist = MutableList(1000) { 0 }
        array.forEach{
            numlist[it] += 1
        }
        var maxN = numlist.maxOf{ it }
        var answer: Int = if (numlist.count{ it == maxN } != 1) -1 else numlist.indexOf(numlist.maxOf{ it })
        return answer
    }
}