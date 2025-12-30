fun main() {
    val n = readln().toInt()
    var square = Array(100) { IntArray(100) { 0 } }
    repeat(n) {
        val (x, y) = readln().split(" ").map{ it.toInt() }
        for (j in y until y + 10) {
            for (i in x until x + 10) {
                if(square[i][j] == 0) square[i][j] = 1
            }
        }
    }
    var acc = 0
    for (i in 0 until 100) {
        acc += square[i].count{ it == 1 }
    }
    println(acc)
}