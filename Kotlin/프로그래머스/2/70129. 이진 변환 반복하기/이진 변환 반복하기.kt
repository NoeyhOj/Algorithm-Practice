class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = customChanger(s, 0, 0).toIntArray()
        return answer
    }
}

fun customChanger(binaryString: String, zeroCounter: Int, counter: Int): List<Int> {
    if (binaryString == "1") {
        return listOf(counter, zeroCounter)
    }
    var newCounter = counter + 1
    var zeroCount = binaryString.count{ it == '0' } + zeroCounter
    var newString = binaryString.filter{ it != '0' }
    var newBinary = newString.length.toString(2)
    return customChanger(newBinary, zeroCount, newCounter)
    
}