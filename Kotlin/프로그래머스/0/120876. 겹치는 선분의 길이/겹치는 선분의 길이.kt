class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var l1 = (lines[0][0]..lines[0][1]).toList()
        var l2 = (lines[1][0]..lines[1][1]).toList()
        var l3 = (lines[2][0]..lines[2][1]).toList()
        
        var same1 = l1.intersect(l2).toList()
        var same2 = l1.intersect(l3).toList()
        var same3 = l2.intersect(l3).toList()
        var same4 = l1.intersect(l2).intersect(l3).toList()
        
        var a = if (same1.isNotEmpty()) {
            same1.last() - same1[0]
        } else {
            0
        }
        var b = if (same2.isNotEmpty()) {
            same2.last() - same2[0]
        } else {
            0
        }
        var c = if (same3.isNotEmpty()) {
            same3.last() - same3[0]
        } else {
            0
        }
        var d = if (same4.isNotEmpty()) {
            same4.last() - same4[0]
        } else {
            0
        }
        
        var answer: Int = a + b + c - (d * 2)
        return answer
    }
}