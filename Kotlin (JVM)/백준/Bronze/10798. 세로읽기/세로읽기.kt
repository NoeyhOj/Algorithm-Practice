fun main() {
    val wordList = (1..5).toList().map {
        readln()
    }.toList()
    val maxLength = wordList.maxOf{ it.length }
    val newList = wordList.map{ it.padEnd(maxLength, '*')}

    val answer = (0 until maxLength).joinToString("") { i ->
        var word = ""
        repeat(5) { j ->
            if (newList[j][i] != '*') word += newList[j][i].toString()
        }
        word
    }

    println(answer)
}