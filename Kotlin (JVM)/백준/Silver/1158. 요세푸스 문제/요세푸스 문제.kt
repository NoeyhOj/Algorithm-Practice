fun main() {
    val (n, k) = readln().split(" ").map{ it.toInt() }
    var nList = (1..n).toList()
    val answerList = mutableListOf<Int>()

    repeat(n) {
        val index = if(k % nList.size - 1 == -1) nList.lastIndex else k % nList.size - 1
        answerList.add(nList[index])
        nList = nList.subList(index + 1, nList.size) + nList.subList(0, index)
    }

    println("<${answerList.joinToString(", ")}>")
}