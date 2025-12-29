class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var parentheses = s.split("").filter{ it != ""}.toMutableList()
        parentheses.indices.forEach {
            if (it != 0) {
                parentheses.add(parentheses.first())
                parentheses.removeAt(0)
            }
            var stack = mutableListOf<String>()
            var counter: Boolean = true
            for (i in parentheses) {
                if (i == "[" || i == "{" || i == "(") {
                    stack.add(i)
                } else if (i == "]") {
                    if (stack.isNotEmpty() && stack.last() == "[") {
                        stack.removeLast()
                    } else {
                        counter = false
                        break
                    }
                } else if (i == ")") {
                    if (stack.isNotEmpty() && stack.last() == "(") {
                        stack.removeLast()
                    } else {
                        counter = false
                        break
                    }
                } else if (i == "}") {
                    if (stack.isNotEmpty() && stack.last() == "{") {
                        stack.removeLast()
                    } else {
                        counter = false
                        break
                    }
                }
            }
            if (stack.isEmpty() && counter) answer += 1
        }
        
        return answer
    }
}