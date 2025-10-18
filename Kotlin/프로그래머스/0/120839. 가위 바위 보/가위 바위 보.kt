class Solution {
    fun solution(rsp: String): String {
        var answer: String = rsp.map{ 
            if (it == '0') {
                '5'
            } else if (it == '2') {
                '0'
            } else {
                '2'
            }
        }.joinToString("")    
        return answer
    }
}