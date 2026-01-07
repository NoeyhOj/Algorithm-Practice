fun main() {
    val word = readln()
    println(word.map {
        if (it.isUpperCase()) {
            (65 + (it.toInt()+13-65) % 26).toChar()
        } else if (it.isLowerCase()) {
            (97 + (it.toInt()+13-97) % 26).toChar()
        } else {
            it
        }
    }.joinToString(""))
}