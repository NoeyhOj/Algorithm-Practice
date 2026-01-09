fun main() {
    var result = 0
    repeat(readln().toInt()) {
        val numbers = readln().split(" ").map{ it.toInt() }
        val maxCount = numbers.distinct().size
        when(maxCount) {
            1 -> result = maxOf(result, 10000 + numbers[0] * 1000)
            2 -> {
                val sameNum = numbers.find{ num -> numbers.count{ it == num } == 2} ?: 0
                result = maxOf(result, 1000 + sameNum * 100)
            }
            3 -> {
                val maxNum = numbers.maxOf{ it }
                result = maxOf(result, maxNum * 100)
            }
        }
    }
    println(result)
}