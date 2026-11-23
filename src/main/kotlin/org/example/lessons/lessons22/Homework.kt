package org.example.lessons.lessons22

class Homework {
/*
Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:

NullPointerException
IndexOutOfBoundsException
ClassCastException
IllegalArgumentException
NumberFormatException
IllegalStateException
OutOfMemoryError
StackOverflowError

Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch
 и создай для каждого типа ошибки свой catch блок
 */
    fun reproduceExceptions() {
        try {
            val text: String? = null
            text!!.length
        } catch (e: NullPointerException) {
            println("NullPointerException")
        }

        try {
            val numbers = listOf(1, 2, 3)
            numbers[10]
        } catch (e: IndexOutOfBoundsException) {
            println("IndexOutOfBoundsException")
        }

        try {
            val value: Any = "текст"
            value as Int
        } catch (e: ClassCastException) {
            println("ClassCastException")
        }

        try {
            require(false) { "Аргумент неверный" }
        } catch (e: IllegalArgumentException) {
            println("IllegalArgumentException")
        }

        try {
            "не число".toInt()
        } catch (e: NumberFormatException) {
            println("NumberFormatException")
        }

        try {
            check(false) { "Недопустимое состояние" }
        } catch (e: IllegalStateException) {
            println("IllegalStateException")
        }

        // Не выделяем огромный объём памяти: искусственно выбрасываем ошибку.
        try {
            throw OutOfMemoryError("OutOfMemoryError")
        } catch (e: OutOfMemoryError) {
            println("OutOfMemoryError")
        }

        try {
            throw StackOverflowError("StackOverflowError")
        } catch (e: StackOverflowError) {
            println("StackOverflowError")
        }
    }

    /*
    Задание 10

    Функция получает Any? и в зависимости от аргумента может вызвать
    одно из перечисленных исключений. Перебрасывание пойманного исключения
    останавливает выполнение функции.
    */
    fun checkArgument(argument: Any?) {
        try {
            when (argument) {
                null -> argument!!
                is List<*> -> argument[argument.size]
                is Int -> argument as String
                is Boolean -> require(argument) { "Аргумент не прошёл проверку" }
                is String -> argument.toInt()
                else -> check(false) { "Недопустимое состояние" }
            }

            println("Переданный аргумент фантастически хорош!")
        } catch (e: Throwable) {
            when (e) {
                is NullPointerException -> println("NullPointerException")
                is IndexOutOfBoundsException -> println("IndexOutOfBoundsException")
                is ClassCastException -> println("ClassCastException")
                is IllegalArgumentException -> println("IllegalArgumentException")
                is IllegalStateException -> println("IllegalStateException")
                else -> println("Другое исключение: ${e::class.simpleName}")
            }

            throw e
        }
    }


    /*
    Задание 11 выбрасывает собственное исключение.
    Задание 12 перехватывает IndexOutOfBoundsException и выбрасывает своё.
    */
    fun main() {
        reproduceExceptions()

        try {
            checkArgument(null)
        } catch (e: NullPointerException) {
            println("Исключение переброшено из checkArgument")
        }

        try {
            val numbers = listOf(1, 2, 3)
            numbers[10]
        } catch (e: IndexOutOfBoundsException) {
            println("Ошибка индекса: ${e.message}")
            throw CustomIndexException(e)
        }

    }
}