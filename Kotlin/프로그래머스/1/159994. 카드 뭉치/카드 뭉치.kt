class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var cards1 = cards1.toMutableList()
        var cards2 = cards2.toMutableList()
        for (word in goal) {
            if (cards1.isNotEmpty() && cards1.first() == word) {
                cards1.removeAt(0)
            } else if (cards2.isNotEmpty() && cards2.first() == word) {
                cards2.removeAt(0)
            } else {
                answer = "No"
                break
            }
        }
        return answer
    }
}