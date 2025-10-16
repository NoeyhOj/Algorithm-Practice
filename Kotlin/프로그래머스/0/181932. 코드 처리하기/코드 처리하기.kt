class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        for (i in code.indices) {
            if (code[i] == '1') {
                if (mode == 0) {
                    mode = 1
                } else {
                    mode = 0   
                }
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        answer += code[i]
                    }
                } else {
                    if (i % 2 == 1) {
                        answer += code[i]
                    }
                }
            }
        }
        return if(answer == "") "EMPTY" else answer
    }
}