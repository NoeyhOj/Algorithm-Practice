fun main() {
    var (a, b, c) = readln().split(" ").map{ it.toInt() }
    val d = readln().toInt()

    c += d

    c = if (c >= 60) {
        b += (c / 60)
        c % 60
    } else c

    b = if (b >= 60) {
        a += (b / 60)
        b % 60
    } else b

    a = if (a >= 24) a % 24 else a

    println("$a $b $c")
}