class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        for (command in commands) {
            answer.add(array.toList().subList(command[0] - 1, command[1]).sorted()[command[2] - 1])
        }
        return answer.toIntArray()
    }
}