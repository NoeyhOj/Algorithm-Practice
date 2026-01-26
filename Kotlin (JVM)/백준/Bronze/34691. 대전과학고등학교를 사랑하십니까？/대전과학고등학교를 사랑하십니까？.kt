fun main() {
    while(true) {
        val answer = readln()
        if (answer == "end") break
        when (answer) {
            "animal" -> println("Panthera tigris")
            "tree" -> println("Pinus densiflora")
            "flower" -> println("Forsythia koreana")
            "end" -> break
            else -> println("잘못된 질문입니다.")
        }
    }
}