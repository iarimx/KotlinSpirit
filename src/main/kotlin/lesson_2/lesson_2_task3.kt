package lesson_2

import kotlin.math.pow

fun main() {
    val checkOutHour = 9
    val checkOutMinutes = 39
    val travelTime = 457
    val arrivalHours = (checkOutHour + (checkOutMinutes + travelTime) / 60) % 24
    // (9 + (39 + 457) / 60) % 24 Да.... век живи, век учись... Элементарно Ватсон
    val arrivalMinutes = (checkOutMinutes + travelTime) % 60
    // 39 + 457 % 60
    println("$arrivalHours:$arrivalMinutes")
}