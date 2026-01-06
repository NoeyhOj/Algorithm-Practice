fun main() {
    val pattern = """(<(\w|\s)+>)|(\w|\s|\d)+""".toRegex()
    val input = readln()
    val all = pattern.findAll(input).map {
        it.value
    }.toList()
    println(all.joinToString("") {
        if (it.first() == '<' && it.last() == '>') {
            it
        } else {
            it.split(" ").joinToString(" ") { it.reversed() }
        }
    })
}