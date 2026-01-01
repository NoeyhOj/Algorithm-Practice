fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (count, index) = readln().split(" ").map{ it.toInt() }
        val nList = (0 until count).toList().zip(readln().split("").toList().filter{ it != "" && it != " " }.map{ it.toInt() }).toMutableList()
        var first = nList.maxOf{ it.second }
        var counter = 0
        while (true) {
            val key = nList[0].first
            if (nList[0].second == first) {
                nList.removeAt(0)
                counter++
                if (key == index) {
                    println(counter)
                    break
                } else {
                    first = nList.maxOf{ it.second }
                }
            } else {
                nList.add(nList[0])
                nList.removeAt(0)
            }
        }
    }
}