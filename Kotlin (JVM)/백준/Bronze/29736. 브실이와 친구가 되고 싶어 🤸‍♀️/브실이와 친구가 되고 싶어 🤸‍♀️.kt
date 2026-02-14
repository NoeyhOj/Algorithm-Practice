fun main() {
    val (a, b) = readln().split(" ").map{ it.toInt() }
    val (k, x) = readln().split(" ").map{ it.toInt() }

    val friends = ((k - x)..(k + x)).toList().count{ it in (a..b).toList()}

    println(if (friends == 0) "IMPOSSIBLE" else friends)
}