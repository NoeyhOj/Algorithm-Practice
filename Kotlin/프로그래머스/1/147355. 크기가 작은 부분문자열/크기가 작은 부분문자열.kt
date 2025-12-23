class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        if (t.length-p.length == 0) {
            if (t.toInt() <= p.toInt()) return 1 else return 0
        } else {
            for (i in 0..(t.length-p.length)) {
                if (t.substring(i, i+p.length).toLong() <= p.toLong()) answer++
            }
        }
        
        return answer
    }
}