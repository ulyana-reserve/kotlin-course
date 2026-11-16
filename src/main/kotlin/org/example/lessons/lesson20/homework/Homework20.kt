package org.example.lessons.lesson20.homework

import kotlin.math.absoluteValue

/*
Определите функцию-расширение для массива чисел, которая не принимает аргументов
и возвращает пару из чисел — первое и последнее. Если массив пуст, вернуть пару
из null-значений.
*/
fun <T : Number> Array<T>.firstAndLast(): Pair<T?, T?> {
    return Pair(firstOrNull(), lastOrNull())
}

/*
Создайте функцию-расширение для изменяемого списка элементов:
с дженериком T, ограниченным интерфейсом Comparable<T>,
которая принимает булево значение и возвращает этот же список
только в виде неизменяемого.
Сам изменяемый список должен стать отсортированным по возрастанию,
если передано true, и по убыванию, если false.
*/
fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    if (direction) {
        sort()
    } else {
        sortDescending()
    }

    return toList()
}

/*
Создайте функцию-расширение для nullable-словаря с дженериком:
ключ является дженериком, значение является списком из nullable-дженериков.
Функция принимает целое число и возвращает nullable-словарь:
ключи исходного словаря приведены к строке через toString(),
значения взяты из списков по индексу из аргумента.
Если такого индекса нет — значением будет null.
*/
fun <K, T> Map<K, List<T?>>?.getValuesAtIndex(index: Int): Map<String, T?>? {
    return this
        ?.map { (key, values) -> key.toString() to values.getOrNull(index) }
        ?.toMap()
}

/*
Реализуйте метод-расширение within для класса Number.
Метод принимает other — число для сравнения — и deviation,
максимально допустимое отклонение. Возвращает true, если разница
между числами не превышает deviation. Для получения отклонения
вызовите у разницы свойство absoluteValue.
*/
fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = (toDouble() - other.toDouble()).absoluteValue
    return difference <= deviation.toDouble()
}

/*
Реализуйте для класса String методы-расширения encrypt и decrypt.
Оба метода принимают параметр base типа Int.
encrypt сдвигает каждый символ вперёд по таблице Unicode,
decrypt — назад на то же число позиций.
*/
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

/*
Напиши метод-расширение строки, который принимает список имён пользователей
и выводит исходную строку побуквенно в верхнем регистре в столбик:
имя автора и букву под ним.
*/
fun String.twitterGame(authors: List<String>) {
    if (authors.isEmpty()) return

    var counter: Int = 0

    for (letter in this) {
        println(authors[counter])
        println(letter.uppercase())
        println()

        counter++
        if (counter >= authors.size) {
            counter = 0
        }
    }
}

fun main() {
    println(arrayOf(10, 20, 30).firstAndLast())
    println(emptyArray<Int>().firstAndLast())

    val numbers = mutableListOf(5, 2, 8, 1)
    println(numbers.sort(true))
    println(numbers)

    val valuesByKey: Map<Int, List<String?>>? = mapOf(
        10 to listOf("a", "b"),
        20 to listOf("c")
    )
    println(valuesByKey.getValuesAtIndex(1))

    val nullValues: Map<Int, List<String?>>? = null
    println(nullValues.getValuesAtIndex(0))

    println(10.within(12, 2))
    println(10.5.within(10.0, 0.5))
    println(10L.within(13L, 2L))

    val original = "Kotlin"
    val encrypted = original.encrypt(2)
    println(encrypted)
    println(encrypted.decrypt(2))

    "кот".twitterGame(listOf("Автор 1", "Автор 2", "Автор 3"))
}