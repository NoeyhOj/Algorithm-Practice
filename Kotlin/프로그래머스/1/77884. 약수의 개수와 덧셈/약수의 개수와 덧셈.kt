import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = (left..right).map{
            if (measure(it) % 2 == 0) it else it * -1
        }.sumOf{ it }
        return answer
    }
}

fun measure(n: Int): Int {
    val meaList = mutableListOf<Int>()
    for (i in 1..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            meaList.add(i)
            if (i != n / i) meaList.add(n / i)
        }
    }
    return meaList.size
}