class Solution {
    fun solution(s: String): IntArray {
        var answer = mutableListOf<Int>()
        var wordMap = mutableMapOf<Char, Int>()
        s.indices.forEach{
            if (wordMap.keys.contains(s[it])) {
                answer.add(it - wordMap[s[it]]!!)
                wordMap[s[it]] = it
            } else {
                answer.add(-1)
                wordMap[s[it]] = it
            }
        }
        return answer.toIntArray()
    }
}