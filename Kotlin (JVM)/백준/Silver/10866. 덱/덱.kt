fun main() {
    val n = readln().toInt()
    val deq = mutableListOf<String>()
    repeat(n) {
        val input = readln()
        if (input.count{ it == ' ' } == 1) {
            val (command, num) = input.split(" ")
            when (command) {
                "push_back" -> deq.add(num)
                "push_front" -> deq.add(0, num)
            }
        } else {
            when (input) {
                "pop_front" -> if(deq.isNotEmpty()) {
                    println(deq.first())
                    deq.removeFirst()
                } else {
                    println("-1")
                }
                "pop_back" -> if(deq.isNotEmpty()) {
                    println(deq.last())
                    deq.removeLast()
                } else {
                    println("-1")
                }
                "front" -> if(deq.isNotEmpty()) {
                    println(deq.first())
                } else {
                    println("-1")
                }
                "back" -> if(deq.isNotEmpty()) {
                    println(deq.last())
                } else {
                    println("-1")
                }
                "size" -> println(deq.size)
                "empty" -> println(if (deq.isEmpty()) "1" else "0")
            }
        }
    }
}