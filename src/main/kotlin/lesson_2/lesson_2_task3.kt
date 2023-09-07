package lesson_2

fun main() {
    val checkOutHour = 9
    val checkOutMinutes = 39
    val travelTimeHour = 457 / 60
    val travelTimeMinutes = 457 % 60
    val travelResultMinutes = checkOutMinutes + travelTimeMinutes
    val travelResultHour = checkOutHour + travelTimeHour
    val result = String.format("%02d:%02d", travelResultHour, travelResultMinutes)
    println(result)



}