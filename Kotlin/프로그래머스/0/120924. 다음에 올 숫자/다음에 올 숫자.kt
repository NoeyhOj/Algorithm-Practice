class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        if (common[1] - common[0] == common[2] - common[1]) {
            var d = common[1] - common[0]
            answer = common.last() + d
        } else {
            var r = common[1] / common[0]
            answer = common.last() * r
        }        
        return answer
    }
}