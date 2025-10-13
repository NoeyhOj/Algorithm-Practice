class Solution {
    fun solution(binomial: String): Int {
        var nList = binomial.split(" ")
        var a = nList[0].toInt()
        var b = nList[2].toInt()
        var answer: Int = when(nList[1]) {
            "+" -> a + b
            "-" -> a - b
            else -> a * b
        }
        return answer
    }
}