import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    val x = readln().toDouble()
    val y = readln().toDouble()

    val numbers = (sqrt(x).toInt()..sqrt(y).toInt()).toList().filter{ it.toDouble().pow(2) in x..y }

    if (numbers.isEmpty()) {
        println(-1)
    } else {
        println(numbers.sumOf{ it.toDouble().pow(2) }.toInt())
        println(numbers.first().toDouble().pow(2).toInt())
    }
}