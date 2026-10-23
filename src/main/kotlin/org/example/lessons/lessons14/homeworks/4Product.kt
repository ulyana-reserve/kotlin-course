package org.example.lessons.lessons14.homeworks

import java.math.BigDecimal

//data class — это специальный вид классов в Kotlin, который предназначен для хранения данных. Они автоматически предоставляют полезные функции,
// такие как toString(), equals(), hashCode(), и copy()

/*
4 Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине.
У него должны быть свойства “название”, “цена”, “количество”.
 */
data class Product (val name: String, val price: Double, val quantity: Int) {

}

fun main() {
    val product1 = Product("yellow apple", 56.56, 2)
    val product2 = product1.copy("red apple")
    println(product1)
    println(product2)

}