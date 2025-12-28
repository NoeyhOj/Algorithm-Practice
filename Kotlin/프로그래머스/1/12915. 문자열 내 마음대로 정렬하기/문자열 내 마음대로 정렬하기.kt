class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = strings.toList().sorted().sortedBy{ it[n] }.toTypedArray()
        return answer
    }
}