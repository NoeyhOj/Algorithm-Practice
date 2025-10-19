class Solution {
    fun solution(n: Int): Int {
        var answer: Int = x(n) / 6
        return answer
    }
    
    fun x(n: Int): Int {
        var nList = mutableListOf<Int>()
        var minNum = minOf(n, 6)
        
        var n = n
        var m = 6

        for (i in 1..minNum) {
            if (n == 1 || m == 1) {
                break
            }
            if (n % i == 0 && m % i == 0) {
                nList.add(i)
                n /= i
                m /= i
            }
        }
        nList.add(n)
        nList.add(m)
        return nList.reduce{ acc, i -> acc * i}
    }
}