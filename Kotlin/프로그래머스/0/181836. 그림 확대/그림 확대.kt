class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer = picture.map{ it.map{ it.toString().repeat(k) }.joinToString("") }.toTypedArray()
        var result = mutableListOf<String>()
        for (i in answer) {
            for (j in 1..k) {
                result.add(i)
            }
        }
        return result.toTypedArray()
    }
}