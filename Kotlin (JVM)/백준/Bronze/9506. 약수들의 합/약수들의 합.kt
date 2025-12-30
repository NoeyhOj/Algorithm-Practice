import kotlin.math.sqrt

fun main() {
    while(true) {
        val n = readln().toInt()
        val nList = mutableListOf<Int>()
        if (n == -1) break
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                if (n / i == i) {
                    nList.add(n / i)
                }
                nList.add(i)
                if (n / i != n) nList.add(n / i)
            }
        }
        if (nList.sumOf{ it } == n) println("$n = ${nList.sorted().joinToString(" + ")}") else println("$n is NOT perfect.")
    }
}