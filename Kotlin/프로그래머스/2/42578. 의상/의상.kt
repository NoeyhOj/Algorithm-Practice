class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var keys = clothes.map{ it.toList().last() }.toSet().toList()
        var answer = keys.fold(1) { acc, x -> acc * (clothes.toList().count{ it.last() == x } + 1) } - 1
        return answer
    }
}