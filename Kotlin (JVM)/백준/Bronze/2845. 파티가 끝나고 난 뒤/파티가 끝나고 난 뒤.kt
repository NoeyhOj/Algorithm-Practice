fun main() {
    val s = readln().split(" ").map{ it.toInt() }.let{ it[0] * it[1] }
    readln().split(" ").map{ it.toInt() }.forEach {
        print("${it - s} ")
    }
}