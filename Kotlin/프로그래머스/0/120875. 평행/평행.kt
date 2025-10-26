class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var g1: Double = 0.0
        var g2: Double = 0.0
        for (i in 1..3) {    
            if (i == 1) {
                g1 = gradient(dots[0], dots[1])
                g2 = gradient(dots[2], dots[3])
            } else if (i == 2) {
                g1 = gradient(dots[0], dots[2])
                g2 = gradient(dots[1], dots[3])
            } else {
                g1 = gradient(dots[0], dots[3])
                g2 = gradient(dots[1], dots[2])
            }
            if (g1 == g2) {
                answer = 1
                break
            }
        }
        return answer
    }
    
    fun gradient(dot1: IntArray, dot2: IntArray): Double {
        return (dot2[1] - dot1[1]).toDouble() / (dot2[0] - dot1[0])
    }
}