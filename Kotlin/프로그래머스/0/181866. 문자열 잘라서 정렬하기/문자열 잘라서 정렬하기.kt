class Solution {
    fun solution(myString: String): Array<String> {
        var answer: Array<String> = myString.split('x').toList().filter{ it != ""}.sorted().toTypedArray()
        return answer
    }
}