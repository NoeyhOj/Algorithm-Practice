fun main() {
    val num = readln().toInt()
    var n = 1
    var m = num - 1
    repeat(num * 2 - 1) {
        if (n <= num) {
            println("*".repeat(n) + " ".repeat((num - n) * 2) + "*".repeat(n))
            n++
        } else {
            println("*".repeat(m) + " ".repeat((num - m) * 2) + "*".repeat(m))
            m--
        }
    }
}