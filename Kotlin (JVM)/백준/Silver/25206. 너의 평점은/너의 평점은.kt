class Subject(private val name: String, val score: Double, val grade: Grade) {
    fun sum(): Double = score * grade.score
}

enum class Grade(val score: Double) {
    APLUS(4.5),
    AZERO(4.0),
    BPLUS(3.5),
    BZERO(3.0),
    CPLUS(2.5),
    CZERO(2.0),
    DPLUS(1.5),
    DZERO(1.0),
    F(0.0),
    P(0.0);

    companion object {
        fun getGrade(grade: String): Grade {
            return when (grade) {
                "A+" -> APLUS
                "A0" -> AZERO
                "B+" -> BPLUS
                "B0" -> BZERO
                "C+" -> CPLUS
                "C0" -> CZERO
                "D+" -> DPLUS
                "D0" -> DZERO
                "F" -> F
                "P" -> P
                else -> throw IllegalArgumentException("잘못된 성적을 입력했음")
            }
        }
    }
}

fun main() {
    val subjects = mutableListOf<Subject>()

    repeat(20) {
        val (name, score, grade) = readln().split(" ")
        subjects.add(Subject(name = name, score = score.toDouble(), grade = Grade.getGrade(grade = grade)))
    }

    val total = subjects.sumOf{ it.sum() } / subjects.filter{ it.grade != Grade.P }.sumOf{ it.score }
    println(String.format("%.6f", total))
}