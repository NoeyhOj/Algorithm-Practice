package com.example.practice

fun main() {
    val name = readln().split("").filter{ it != ""}
    val numbers = name.map { dummy ->
        when (dummy) {
            "A", "B", "C" -> 2
            "D", "E", "F" -> 3
            "G", "H", "I" -> 4
            "J", "K", "L" -> 5
            "M", "N", "O" -> 6
            "P", "Q", "R", "S" -> 7
            "T", "U", "V" -> 8
            "W", "X", "Y", "Z" -> 9
            else -> 1
        }
    }
    println(numbers.sumOf{ it } + (numbers.size * 1))
}