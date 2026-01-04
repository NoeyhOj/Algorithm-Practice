fun main() {
    var n = readln().toInt()
    val numbers = Array(3) { 0 }

    repeat(3) {
        when (it) {
            0 -> {
                numbers[it] += n / 300
                n %= 300
            }
            1 -> {
                numbers[it] += n / 60
                n %= 60
            }
            2 -> {
                numbers[it] += n / 10
                n %= 10
            }
        }
    }
    println(if (n != 0) -1 else numbers.joinToString(" "))
}