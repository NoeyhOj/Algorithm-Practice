class Solution {
    fun solution(strArr: Array<String>): Int {
        var countList = MutableList<Int>(strArr.maxOf{ it.length }) { 0 }
        strArr.forEach{ countList[it.length - 1] += 1 }
        var answer: Int = countList.maxOf{ it }
        return answer
    }
}