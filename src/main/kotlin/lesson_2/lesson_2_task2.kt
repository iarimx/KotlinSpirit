package lesson_2

fun main() {
    val permanentWorkers = 50
    val traineeWorker = 30
    val payTraineeWorker = 20000
    val commonPayTraineeWorker = traineeWorker * payTraineeWorker
    val payOneWorker = 30000
    val commonPayWorkers = permanentWorkers * payOneWorker // расходы компании на постоянных сотрудников
    println(commonPayWorkers)
    val commonPay = commonPayTraineeWorker + commonPayWorkers // расходы компании после прихода стажеров
    println(commonPay)
    val mediumPay = commonPay / 80 // средняя зарплата сотрудника
    println(mediumPay)

}