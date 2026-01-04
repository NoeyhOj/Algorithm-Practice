fun main() {
    var total = 0
    var max = 0
    repeat(4) {
        val (out, inn) = readln().split(" ").map{ it.toInt() }
        total += (-out + inn)
        max = maxOf(total, max)

    }
    println(max)
}