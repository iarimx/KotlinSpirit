package lesson_4

fun main() {
    var reservedTablesToday = 13
    var freeTableTomorrow = 4

    val  isTodayFree = reservedTablesToday < TABLES_COUNT
    val  isTomorrowFree = freeTableTomorrow < TABLES_COUNT

    println("Доступность столиков на сегодня: $isTodayFree " + "\nДоступность столиков на завтра: $isTomorrowFree")


}
const val TABLES_COUNT = 13