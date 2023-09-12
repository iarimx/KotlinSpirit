package lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70000
    val percent: Double = 16.7
    val year = 20
    val sumFinale: Double = sum * (1 + percent / 100).pow(1 * year)
    println(sumFinale)
}