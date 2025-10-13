class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var arr1 = arr.toList()
        var arr2 = arr.toList().map{
                if (it >= 50 && it % 2 == 0) {
                    it / 2 
                } else if (it < 50 && it % 2 == 1) {
                    it * 2 + 1
                } else {
                    it
                }
            }
        while (arr1 != arr2) {
            arr1 = arr2
            arr2 = arr1.toList().map{
                if (it >= 50 && it % 2 == 0) {
                    it / 2 
                } else if (it < 50 && it % 2 == 1) {
                    it * 2 + 1
                } else {
                    it
                }
            }
            answer += 1
        }
        return answer
    }
}