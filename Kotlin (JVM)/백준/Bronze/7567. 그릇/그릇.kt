fun main() {
    val numbers = readln().toList()
    var total = 0
    var before = '|'
    numbers.forEach {
        if (before == '|') {
            total += 10
        } else {
            if (before == it) {
                total += 5
            } else {
                total += 10
            }
        }
        before = it
    }
    println(total)
}