fun main() {
    val alphabet = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = readln()
    for (i in alphabet) {
        if(input.contains(i)) input = input.replace(i, "1")
    }
    println(input.length)
}