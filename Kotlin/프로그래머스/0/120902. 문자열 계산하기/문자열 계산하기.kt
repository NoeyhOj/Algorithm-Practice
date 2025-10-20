class Solution {
    fun solution(my_string: String): Int {
        var nList = my_string.split(" ")
        var result = nList[0].toInt()
        for (i in 1..(nList.size - 1) step 2) {
            if (nList[i] == "+") {
                result += nList[i + 1].toInt()
            } else {
                result -= nList[i + 1].toInt()
            }
        }
        return result
    }
}