class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        for (i in myString) {
            if (i.isLowerCase()) {
                answer += i.toUpperCase()
            } else {
                answer += i
            }
        }
        
        return answer
    }
}