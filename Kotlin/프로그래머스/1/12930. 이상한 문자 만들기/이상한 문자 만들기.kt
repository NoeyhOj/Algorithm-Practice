class Solution {
    fun solution(s: String): String {
        var answer: String = s.split(" ").map{ word -> 
            word.indices.map{ index ->
                if(index % 2 == 0) word[index].uppercase() else word[index].lowercase() 
            }.joinToString("")
        }.joinToString(" ")
        return answer
    }
}