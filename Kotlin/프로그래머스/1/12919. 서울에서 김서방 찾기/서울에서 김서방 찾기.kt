class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = seoul.indices.filter{ seoul[it] == "Kim" }
        return "김서방은 ${answer[0]}에 있다"
    }
}