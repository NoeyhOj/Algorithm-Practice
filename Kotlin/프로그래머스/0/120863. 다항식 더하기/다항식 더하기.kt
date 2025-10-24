class Solution {
    fun solution(polynomial: String): String {
        var strlist = polynomial.split(" ").filter{ it != "+" }
        var xNum = Regex("x$")
        var a = 0
        var b = 0
        for (i in strlist) {
            if (i.endsWith("x")) {
                if (i == "x") {
                    a += 1
                } else {
                    a += (i.dropLast(1)).toInt()
                }
            } else {
                b += i.toInt()
            }
        }
        var answer: String = if (a == 0) {
            "${b}"
        } else if(b == 0) {
            if (a == 1) "x" else "${a}x"
        } else {
            if (a == 1) "x + ${b}" else "${a}x + ${b}"
        }
        return answer
    }
}