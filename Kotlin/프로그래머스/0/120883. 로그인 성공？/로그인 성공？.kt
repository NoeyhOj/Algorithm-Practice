class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = "fail"
        for ((id, pw) in db) {
            if (id_pw[0] == id) {
                if (id_pw[1] == pw) {
                    answer = "login"
                    break
                }
                else {
                    answer = "wrong pw"
                    break
                }
            }
        }
        return answer
    }
}