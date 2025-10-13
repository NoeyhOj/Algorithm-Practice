class Solution {
    fun solution(arr: IntArray): IntArray {
        var s = arr.indexOf(2)
        var e = arr.lastIndexOf(2)
        return if (s == -1 && e == -1) intArrayOf(-1) else arr.toList().subList(s, e + 1).toIntArray()
    }
}