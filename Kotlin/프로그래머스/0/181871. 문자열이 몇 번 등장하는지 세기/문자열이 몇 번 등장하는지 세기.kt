class Solution {
    fun solution(myString: String, pat: String): Int {
        var stringList = mutableListOf<String>()
        for (i in 0..myString.length - pat.length) {
            stringList.add(myString.substring(i, pat.length + i))
        }
        var answer: Int = stringList.count{ it == pat }
        return answer
    }
}