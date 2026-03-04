fun main() {
    val answer = readln().toInt()
    println(readln().split(" ").map{ it.toInt() }.count{ it == answer})
}