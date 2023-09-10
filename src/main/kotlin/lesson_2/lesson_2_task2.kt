package lesson_2

fun main() {
    val permanentWorkers = 50
    val payOneWorker = 30000
    val traineeWorker = 30
    val payTraineeWorker = 20000
    val commonPayWorkers = permanentWorkers * payOneWorker // общая зарплата постоянных работников
    val commonPayTraineeWorker = traineeWorker * payTraineeWorker // общая зарплата стажеров
    val commonPay = commonPayTraineeWorker + commonPayWorkers
    val mediumPay = commonPay / (permanentWorkers + traineeWorker)
    // 1. расходы компании на постоянных сотрудников
    println(commonPayWorkers)
    // 2. расходы компании после прихода стажеров
    println(commonPay)
    // 3. средняя зарплата сотрудника
    println(mediumPay)

}