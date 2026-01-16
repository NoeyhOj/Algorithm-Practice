fun main() {
    val (a1, b1) = readln().split(" ").map{ it.toInt() }
    val (a2, b2) = readln().split(" ").map{ it.toInt() }
    if ((a1+a2) < (b1+b2)) {
        println("Hanyang Univ.")
    } else if((a1+a2) > (b1+b2)) {
        println("Yongdap")
    } else {
        println("Either")
    }
}