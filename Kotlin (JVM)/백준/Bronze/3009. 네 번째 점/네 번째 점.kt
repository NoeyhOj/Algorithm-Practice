fun main() {
    val nList = mutableListOf<List<Int>>()
    repeat(3) {
        nList.add(readln().split(" ").map{ it.toInt() }.toList())
    }

    val x = nList.map{ it[0] }
    val y = nList.map{ it[1] }
    println("${x.filter{ num -> x.count{ it == num } == 1}[0]} ${y.filter{ num -> y.count{ it == num } == 1}[0]}")
}