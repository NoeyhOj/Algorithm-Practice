class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        var dumy = discount.toList().subList(0, 10).toMutableList()

        for (i in 0..(discount.size - 10)) {
            if (i != 0) {
                dumy.removeAt(0)
                dumy.add(discount[i + 9])
            }
            
            var counter: Boolean = true
            
            for (j in want.indices) {
                if (dumy.count{ it == want[j] } != number[j]) {
                    counter = false
                    break
                }
            }
            
            if (counter) {
                answer += 1
            }
        }
        return answer
    }
}