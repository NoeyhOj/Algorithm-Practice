fun main() {
    var totalPrice = readln().toInt()
    var totalCount = readln().toInt()
    var account: Int = 0

    repeat(totalCount) {
        var (price, count) = readln().split(" ").map{ it.toInt() }
        account += (price * count)
    }

    println(if (totalPrice == account) "Yes" else "No")
}