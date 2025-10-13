class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = names.filter{ names.indexOf(it) % 5 == 0 }.toTypedArray()
        return answer
    }
}