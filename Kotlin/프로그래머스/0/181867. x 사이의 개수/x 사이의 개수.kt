class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = myString.split('x').map{ it.length }.toIntArray()
        return answer
    }
}