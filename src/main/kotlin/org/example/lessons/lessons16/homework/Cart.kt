package org.example.lessons.lessons16.homework

class ShoppingCart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        addToCart(itemId, 1)
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for (entry in newItems) {
            addToCart(entry.key, entry.value)
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        val result = StringBuilder()
        var totalAmount = 0

        result.append("Корзина товаров\n")
        result.append("---------------------------\n")
        result.append("ID товара | Количество\n")
        result.append("---------------------------\n")

        for (entry in items) {
            result.append("${entry.key}        | ${entry.value}\n")
            totalAmount += entry.value
        }

        result.append("---------------------------\n")
        result.append("Количество артикулов: ${items.size}\n")
        result.append("Всего товаров: $totalAmount")

        return result.toString()
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addToCart(100)
    cart.addToCart(101, 3)
    cart.addToCart(mapOf(202 to 2, 303 to 1))
    cart.addToCart(listOf(101, 404, 202))

    println(cart)
}