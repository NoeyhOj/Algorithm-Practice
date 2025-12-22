class Solution {
    fun solution(elements: IntArray): Int {
        var aSet = mutableSetOf<Int>()
        var eSize = elements.size
        var eList = elements.toList()
        for (i in 1..eSize) {
            for (j in elements.indices) {
                aSet.add(if (j + i >= eSize) (eList.subList(j, eSize) + eList.subList(0, (j + i) % eSize)).sumOf{ it } else eList.subList(j, (j+i)).sumOf{ it })
                }
            }
        var answer: Int = aSet.size
        return answer
    }
}