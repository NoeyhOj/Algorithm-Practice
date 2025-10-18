class Solution {
    fun solution(my_string: String): String {
        val aeiou = listOf<Char>('a', 'e', 'i', 'o', 'u')
        var answer: String = my_string.filter{ !aeiou.contains(it) }
        return answer
    }
}