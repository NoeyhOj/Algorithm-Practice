fun main() {
    // TODO: 코드 입력
    val words = mutableListOf<String>()
    var word = ""
    readln().forEach{
        if (word.length == 10) {
            words.add(word)
            word = ""
        }
        word += it.toString()
    }
    words.add(word)
    println(words.filter{ it != "" }.joinToString("\n"))
}