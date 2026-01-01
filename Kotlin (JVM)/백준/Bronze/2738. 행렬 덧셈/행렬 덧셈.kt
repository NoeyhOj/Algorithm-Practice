fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    val nList = mutableListOf<List<Int>>()
    repeat(n * 2) { num ->
        val rowList = readln().split(" ").map{ it.toInt() }.toList()
        if (num < n) {
            nList.add(rowList)
        } else {
            nList[num % n] = nList[num % n].zip(rowList){ num1, num2 -> num1 + num2 }
        }
    }
    nList.forEach{ row ->
        println(row.joinToString(" "))
    }
}