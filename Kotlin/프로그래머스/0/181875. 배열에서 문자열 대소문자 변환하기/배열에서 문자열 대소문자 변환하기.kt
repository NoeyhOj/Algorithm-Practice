class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = strArr.indices.map{ if (it % 2 == 0) strArr[it].lowercase() else strArr[it].uppercase() }.toTypedArray()
        return answer
    }
}