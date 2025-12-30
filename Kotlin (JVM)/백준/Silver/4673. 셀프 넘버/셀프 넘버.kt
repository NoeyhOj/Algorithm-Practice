fun main() {
    var selfSet = mutableSetOf<Int>()
    for (i in 1..10000) {
        selfSet.add(i + i.toString().split("").filter{ it != "" }.sumOf{ it.toInt() })
    }

    for (i in 1..10000) {
        if (!selfSet.contains(i)) println(i)
    }
}