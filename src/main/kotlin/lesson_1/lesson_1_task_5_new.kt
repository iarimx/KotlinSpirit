package lesson_1

fun main() {
    var timeInSpace = 6480
    timeInSpace = 1
    val minutes = 48
    val secondsByte: Byte = 0
//    println("0$timeInSpace:$minutes:0$secondsByte")
//    print("0")
//    print(timeInSpace)
//    print(":")
//    print(minutes)
//    print(":0")
//    print(secondsByte)
    val result = String.format("%02d:%02d:%02d", timeInSpace, minutes, secondsByte)
    println(result)

}