class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = if (dic.any{ it.toList().sorted().joinToString("") == spell.sorted().joinToString("") }) 1 else 2
        return answer
    }
}