fun main() {
    val n = readln().toInt()
    val nArray = Array(n + 1) { 0 }
    for (i in 0..n) {
        when (i) {
            0 -> {
                nArray[i] = 0
            }
            1 -> {
                nArray[i] = 1
            }
            else -> {
                nArray[i] = nArray[i - 1] + nArray[i - 2]
            }
        }
    }
    println(nArray.last())
}