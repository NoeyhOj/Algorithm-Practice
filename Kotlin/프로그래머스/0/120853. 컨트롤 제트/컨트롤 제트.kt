class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var nList = s.split(" ")
        var z: Int = 0
        for (i in nList) {
            if (i == "Z") {
                answer -= z
            } else {
                z = i.toInt()
                answer += z
            }
            
        }
        return answer
    }
}