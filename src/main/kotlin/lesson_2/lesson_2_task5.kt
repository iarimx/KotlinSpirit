package lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70000
    val percent: Double = 0.167
    val year = 20
    val sumFinale = sum * (1 + percent/1).pow(1 * year)
    println(sumFinale)
}