package lesson_1

fun main() {
    var timeInSpace = 6480
    timeInSpace = 1
    val minutes = 48
    val secondsByte: Byte = 0
    val result = String.format("%02d:%02d:%02d", timeInSpace, minutes, secondsByte)
    println(result)

}