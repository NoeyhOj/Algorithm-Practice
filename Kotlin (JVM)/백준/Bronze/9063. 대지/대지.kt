fun main() {
    val n = readln().toInt()
    val spotList = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        spotList.add(readln().split(" ").map{ it.toInt() }.let{ Pair(it[0], it[1]) })
    }
    println((spotList.maxOf{ it.first } - spotList.minOf{ it.first }) * (spotList.maxOf{ it.second } - spotList.minOf{ it.second }))
}
