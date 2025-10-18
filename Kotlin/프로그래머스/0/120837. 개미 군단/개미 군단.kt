class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var hp = hp
        while (true) {
            if (hp / 5 != 0) {
                answer += hp / 5
                hp = hp % 5
            } else if (hp / 3 != 0) {
                answer += hp / 3
                hp = hp % 3
            } else {
                answer += hp
                break
            }
        }
        return answer
    }
}