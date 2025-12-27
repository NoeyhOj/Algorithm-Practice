class Solution {
    fun solution(food: IntArray): String {
        var foods: String = ""
        food.indices.forEach{ 
            if (it == 0) return@forEach
            foods += it.toString().repeat(food[it] / 2)
        }
        var answer: String = foods + "0" + foods.reversed()

        return answer
    }
}