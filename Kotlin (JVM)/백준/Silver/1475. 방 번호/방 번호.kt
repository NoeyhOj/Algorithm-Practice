import kotlin.math.roundToInt

fun main() {
    val num = readln().toList().map{ it.digitToInt() }
    val numbers = Array<Int>(11) { 0 }
    num.forEach{
        numbers[it] += 1
    }
    numbers[10] += ((numbers[6] + numbers[9]).toDouble() / 2).roundToInt()
    numbers[6] = 0
    numbers[9] = 0
    println(numbers.maxOf{ it })
}