package lesson_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var chessMove = 1

    println("[$whereFrom - $where; $chessMove]")

    whereFrom = "E4"
    where = "E5"
    chessMove = 2

    println("[$whereFrom - $where; $chessMove]")

    chessMove = 3
    whereFrom = "D2"
    where = "D4"

    println("[$whereFrom - $where; $chessMove]")

}