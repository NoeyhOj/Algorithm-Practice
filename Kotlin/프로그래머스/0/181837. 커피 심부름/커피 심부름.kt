class Solution {
    fun solution(order: Array<String>): Int {
        var americanoList =listOf("iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything")
        var cafelatteList = listOf("icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte")
        var answer: Int = order.map{ if (americanoList.contains(it)) 4500 else 5000 }.sumOf{ it }
        return answer
    }
}