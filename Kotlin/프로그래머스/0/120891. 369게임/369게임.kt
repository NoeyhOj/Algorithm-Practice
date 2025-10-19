class Solution {
    fun solution(order: Int): Int {
        var answer: Int = order.toString().count{ it == '3'} + order.toString().count{ it == '6'} + order.toString().count{ it == '9'}
        return answer
    }
}