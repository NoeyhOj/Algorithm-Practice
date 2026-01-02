fun main() {
    val alphabets = Array(26) { 0 }
    readln().forEach{
        alphabets[it.toInt() - 97] += 1
    }
    println(alphabets.joinToString(" "))
}