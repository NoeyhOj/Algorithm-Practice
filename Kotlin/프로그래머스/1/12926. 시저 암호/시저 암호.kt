class Solution {
    fun solution(s: String, n: Int): String {
        var bigList = ('A'..'Z').toList()
        var smallList = ('a'..'z').toList()
        var answer = s.map{ 
            if (it == ' ') {
                " "
            } else if(it.isUpperCase()) {
                bigList[(bigList.indexOf(it) + n) % 26].toString() 
            } else {
                smallList[(smallList.indexOf(it) + n) % 26].toString() 
            }
        }.joinToString("")
        return answer
    }
}