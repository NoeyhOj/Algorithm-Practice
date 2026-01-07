fun main() {
    val numbers = List(5) { readln().split(" ").sumOf{ it.toInt() }}
    numbers.maxOf{ it }.let {
        println("${numbers.indexOf(it)+1} $it")
    }
}