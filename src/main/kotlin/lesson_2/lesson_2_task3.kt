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
    // Все.... я просто сломал голову над этой элементарной задачей. Я знаю ответ 17:16
    // но как его вывести я не понимаю. Весь интернет перелопатил... Сдаюся!!!Help
}