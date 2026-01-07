fun main() {
    var zero = 0
    var one = 0
    repeat(readln().toInt()) {
        val num = readln().toInt()
        if (num == 0) {
            zero++
        } else if(num == 1) {
            one++
        }
    }
    println(if(zero > one) "Junhee is not cute!" else "Junhee is cute!")
}