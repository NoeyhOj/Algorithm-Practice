fun main() {
    val nList = mutableListOf<List<Int>>()
    repeat(3) {
        nList.add(readln().split(" ").map{ it.toInt() }.toList())
    }
    println("${nList.map{ it[0] }.let{ xList -> xList.filter{ num -> xList.count{ it == num } == 1 }[0]}} ${nList.map{ it[1] }.let{ yList -> yList.filter{ num -> yList.count{ it == num } == 1 }[0]}}")
}