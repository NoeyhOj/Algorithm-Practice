fun main() {
    val moumm = listOf('a', 'e', 'i', 'o', 'u')
    while(true) {
        var count = 0
        val word = readln()
        if (word == "#") break
        println(word.lowercase().count{ moumm.contains(it) })
    }
}