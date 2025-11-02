class Solution {
    fun solution(a: Int, b: Int): Int {
        val deno: Int = b / greatcomdiv(a, b)
        var answer: Int = if (division(deno)) 1 else 2
        return answer
    }
    
    fun division(deno: Int): Boolean {
        if (deno == 1) return true
        else {
            if (deno % 2 == 0) {
                return division(deno / 2)
            } else if (deno % 5 == 0) {
                return division(deno / 5)
            } else return false 
        }
    }
    
    // 최대 공약수
    fun greatcomdiv(a: Int, b: Int): Int {
        if (a == b || a % b == 0) return b
        return greatcomdiv(b, a % b)
    }
}