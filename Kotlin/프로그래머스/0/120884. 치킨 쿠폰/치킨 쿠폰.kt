class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = service(chicken)
        return answer
    }
    
    fun service(chicken: Int): Int {
        if (chicken < 10) return 0
        return chicken / 10 + service(chicken / 10 + chicken % 10)
    }
}