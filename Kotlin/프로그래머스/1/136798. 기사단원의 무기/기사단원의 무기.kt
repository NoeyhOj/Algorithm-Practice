import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var numbers = (1..number).toList().map{
            var counter = 0
            for (i in 1..sqrt(it.toDouble()).toInt()) {
                if(it / i == i && it % i == 0) {
                    counter += 1
                } else if(it % i == 0) {
                    counter += 2
                }
            }
            counter
        }.filter{ it <= limit }
         var answer: Int = numbers.sumOf{ it } + (number - numbers.size) * power
        return answer
    }
}