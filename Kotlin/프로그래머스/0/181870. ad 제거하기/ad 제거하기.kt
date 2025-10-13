class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = strArr.toList().filter{ !it.contains("ad") }.toTypedArray()
        return answer
    }
}