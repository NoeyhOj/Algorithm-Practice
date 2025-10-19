class Solution {
    fun solution(array: IntArray, n: Int): Int {
        val sublist = array.map{ if(it - n < 0) ((it - n) * -1) else (it - n) }
        val minnum = sublist.indices.filter{ sublist[it] == sublist.minOf{ it } }
        var answer: Int = minnum.map{ array[it] }.minOf{ it }
        return answer
    }
}