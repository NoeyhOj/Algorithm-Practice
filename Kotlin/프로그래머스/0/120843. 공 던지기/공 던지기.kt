class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var nList = listOf<Int>()
        if (numbers.size % 2 == 0) {
            nList = numbers.toMutableList().filter{ it % 2 == 1 }
        } else {
            nList = numbers.toMutableList().filter{ it % 2 == 1 } + numbers.toMutableList().filter{ it % 2 == 0}
        }
        var num = if (k % nList.size == 0) nList.size - 1 else k % nList.size - 1
        var answer: Int = nList.get(num)
        return answer
    }
}