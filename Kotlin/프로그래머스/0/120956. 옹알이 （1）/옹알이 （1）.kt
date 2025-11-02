class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = babbling.filter{ 
            it.split("aya", "ye", "woo", "ma").count{ it != "" } == 0
        }.size
        return answer
    }
}