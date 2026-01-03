fun main() {
    val lengthList = mutableListOf<Int>()
    repeat(3) {
        lengthList.add(readln().toInt())
    }
    if (lengthList.sumOf{ it } == 180) {
        when (lengthList.toSet().size) {
            3 -> println("Scalene")
            2 -> println("Isosceles")
            else -> println("Equilateral")
        }
    } else {
        println("Error")
    }
}