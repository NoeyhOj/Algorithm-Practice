class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) { 0 } }
        var i = 1
        var r = 0
        var maxR = n - 1
        var minR = 1
        var c = 0
        var maxC = n - 1
        var minC = 0
        var key = "right"
        
        while (i <= n * n) {
            answer[r][c] = i
            i += 1
            if (key == "right") {
                if (c < maxC) {
                    c += 1
                } else {
                    maxC -= 1
                    r += 1
                    key = "down"
                }
            } else if (key == "down") {
                if (r < maxR) {
                    r += 1
                } else {
                    maxR -= 1
                    c -= 1
                    key = "left"
                }
            } else if (key == "left") {
                if (c > minC) {
                    c -= 1
                } else {
                    minC += 1
                    r -= 1
                    key = "up"
                }
            } else if (key == "up") {
                if (r > minR) {
                    r -= 1
                } else {
                    minR += 1
                    c += 1
                    key = "right"
                }
             }
        }
        return answer
    }
}