fun main() {
    val inputPrice = 10000 // 100 руб. в копейках

    val commissionSize = 0.75 // В процентах
    val minimumCommission = 3500.0; // 35 руб. в копейках

    var commission = inputPrice * commissionSize / 100 // Размер комиссии

    if (commission < minimumCommission) commission = minimumCommission; // Если комиссия меньше минимума

    if (commission < inputPrice) {
        val amount = inputPrice - commission;
        println("Total summ: $amount")
    } else {
        // Перевод невозможен?
        println("Operation failed")
    }

}