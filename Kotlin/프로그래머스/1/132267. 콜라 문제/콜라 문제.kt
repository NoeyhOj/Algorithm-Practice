class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var eat = n
        while (eat >= a) {
        answer += ((eat / a) * b)
        if (eat % a != 0) eat = (eat / a) * b + (eat % a) else eat = (eat / a) * b
    }
        return answer
    }
}