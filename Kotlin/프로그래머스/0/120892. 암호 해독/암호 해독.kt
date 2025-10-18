class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = cipher.indices.filter{ (it + 1) % code == 0 }.map{ cipher[it] }.joinToString("")
        return answer
    }
}