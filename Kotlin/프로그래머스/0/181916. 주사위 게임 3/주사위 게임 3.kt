class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var sixList = MutableList<Int>(6) { 0 }
        sixList[a - 1] += 1
        sixList[b - 1] += 1
        sixList[c - 1] += 1
        sixList[d - 1] += 1
        var maxNum = sixList.maxOf{ it }
        when (maxNum) {
            4 -> return (sixList.indexOf(4) + 1) * 1111
            3 -> return (10 * (sixList.indexOf(3) + 1) + sixList.indexOf(1) + 1) * (10 * (sixList.indexOf(3) + 1) + sixList.indexOf(1) + 1)
            2 -> {
                val twoList = mutableListOf<Int>()
                val oneList = mutableListOf<Int>()
                for (i in sixList.indices) {
                    if (sixList[i] == 2) {
                        twoList.add(i + 1)
                    } else if (sixList[i] == 1) {
                        oneList.add(i + 1)
                    }
                } 
                if (twoList.size == 2) {
                    val p = maxOf(twoList[0], twoList[1])
                    val q = minOf(twoList[0], twoList[1])
                    return (p + q) * (p - q)
                } else {
                    return oneList[0] * oneList[1]
                }
            }
            else -> {
                val numList = sixList.filter{ it == 1 }.map{ sixList.indexOf(it) + 1 }
                return numList.minOf{ it }
            }
        }
    }
}