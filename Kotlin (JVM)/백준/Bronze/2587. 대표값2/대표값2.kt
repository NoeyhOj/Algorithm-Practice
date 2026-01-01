fun main() {
    val numList = (0 until 5).toList().map {
        readln().toInt()
    }
    println(numList.sumOf{ it } / 5)
    println(numList.sorted()[2])
}