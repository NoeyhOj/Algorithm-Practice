fun main() {
    println("${score(readln().split(" ").map{ it.toInt() })} ${score(readln().split(" ").map{ it.toInt() })}")
}

fun score(numbers: List<Int>): Int {
    return (numbers[0] * 6) + (numbers[1] * 3) + (numbers[2] * 2) + numbers[3] + (numbers[4] * 2)
}