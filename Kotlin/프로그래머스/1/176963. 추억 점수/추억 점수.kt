class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = photo.map{ names ->
            var score = 0
            names.forEach { e ->
                if (name.contains(e)) score += yearning[name.indexOf(e)]
            }
            score
        }.toIntArray()
        return answer
    }
}