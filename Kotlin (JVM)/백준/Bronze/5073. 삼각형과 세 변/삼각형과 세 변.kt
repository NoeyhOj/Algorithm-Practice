fun main() {
    while (true) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        if (a == 0 && b == 0 && c == 0) break
        val numbers = listOf(a, b, c).sorted()
        if (numbers[2] >= numbers[1] + numbers[0]) {
            println("Invalid")
            continue
        }
        when (numbers.toSet().size) {
            3 -> println("Scalene")
            2 -> println("Isosceles")

            1 -> println("Equilateral")
        }
    }
}
