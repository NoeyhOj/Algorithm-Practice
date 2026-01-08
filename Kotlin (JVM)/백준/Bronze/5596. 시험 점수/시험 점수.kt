fun main() {
    val a = readln().split(" ").sumOf{ it.toInt() }
    val b = readln().split(" ").sumOf{ it.toInt() }
    println(maxOf(a,b))
}