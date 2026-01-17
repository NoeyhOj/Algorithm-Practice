fun main() {
    val (h, m) = readln().split(" ").map{ it.toInt() }
    val p = readln().toInt()
    val newM = (m + p) % 60
    val newH = ((m + p) / 60 + h) % 24
    println("$newH $newM")
}
