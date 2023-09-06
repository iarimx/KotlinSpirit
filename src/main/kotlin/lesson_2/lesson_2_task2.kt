package lesson_2

fun main() {

    val expensesCompany = 50 * 30000 // 50 чел. по 30 000 р. = 1 500 000 р.
    val expensesForInterns = 30 * 20000 + expensesCompany // 30 стажеров по 20 000 р. = 600000 + 1500000 = 2100000 р. Общие расходы по ЗП после прихода стажеров;
    val mediumPrice = expensesForInterns / 80
    println(expensesCompany)
    println(expensesForInterns)
    println(mediumPrice)
}