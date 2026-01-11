import kotlin.math.abs

fun main() {
    repeat(readln().toInt()) {
        println(String.format("%.1f", abs(readln().split(" ").map{ it.toDouble() }.reduce { acc, x -> acc - x })))
    }
}