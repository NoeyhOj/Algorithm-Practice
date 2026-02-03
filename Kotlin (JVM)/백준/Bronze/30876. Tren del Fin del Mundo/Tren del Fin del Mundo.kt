fun main() {
    val nList = mutableListOf<Pair<Int, Int>>()
    repeat(readln().toInt()) {
        nList.add(readln().split(" ").map{ it.toInt() }.let{ it[0] to it[1]})
    }
    nList.filter{ it.second == nList.minOf{ it.second } }.first().also {
        println("${it.first} ${it.second}")
    }
}