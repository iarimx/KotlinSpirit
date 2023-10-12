package lesson_4

fun main() {
    var todayTable = 13
    var tomorrowTable = 4

    val todayResult = todayTable < COMMON_TABLE
    val tomorrowResult = tomorrowTable < COMMON_TABLE

    println("Доступность столиков на сегодня: $todayResult " + "\nДоступность столиков на завтра: $tomorrowResult")


}
const val COMMON_TABLE = 13