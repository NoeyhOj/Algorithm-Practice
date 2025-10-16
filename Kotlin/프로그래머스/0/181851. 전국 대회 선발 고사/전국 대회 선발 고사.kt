class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var nList = rank.filter{ attendance[rank.indexOf(it)] }.sorted().subList(0, 3).map{ rank.indexOf(it) }
        return (10000 * nList[0] + 100 * nList[1] + nList[2])
    }
}