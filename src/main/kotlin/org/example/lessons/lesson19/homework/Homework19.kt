package org.example.lessons.lesson19.homework

import org.example.lessons.lesson19.homework.classes.ListHolder
import org.example.lessons.lesson19.homework.classes.ListValidator
import org.example.lessons.lesson19.homework.classes.OddValidator
import org.example.lessons.lesson19.homework.classes.PhrasesToListOfStrings
import org.example.lessons.lesson19.homework.classes.StringValidator

class Homework19 {

    /*
    1. Напиши функцию getMiddleElement с дженериком, которая будет принимать список
    и возвращать средний элемент, если он существует, иначе возвращать null.
    Например, у списка из четырёх элементов — среднего элемента нет.
    */
    fun <T> getMiddleElement(list: List<T>): T? {
        return if (list.size % 2 == 1) list[list.size / 2] else null
    }

    /*
    5. Создай функцию transposition с двумя дженериками, которая принимает
    словарь с дженериками и возвращает словарь, в котором ключ и значения поменялись местами.
    */
    fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
        return map.map { (key, value) -> value to key }.toMap()
    }
}

fun main() {
    val homework = Homework19()

    println(homework.getMiddleElement(listOf(1, 2, 3))) // 2
    println(homework.getMiddleElement(listOf(1, 2, 3, 4))) // null

    println(homework.transposition(mapOf("one" to 1, "two" to 2))) // {1=one, 2=two}

    val listHolder = ListHolder<String>()
    listHolder.add("Kotlin")
    listHolder.add("Java")
    println(listHolder.getAll())

    val phrasesMapper = PhrasesToListOfStrings()
    println(phrasesMapper.map("Kotlin is fun"))
    println(phrasesMapper.mapList(listOf("Kotlin is fun", "Hello world")))

    val stringValidator = StringValidator()
    println(stringValidator.validate("Kotlin")) // true
    println(stringValidator.validate("")) // false
    println(stringValidator.validate("   ")) // false
    println(stringValidator.validate(null)) // false

    val oddValidator = OddValidator()
    println(oddValidator.validate(4)) // true
    println(oddValidator.validate(3)) // false

    val listValidator = ListValidator<Int>()
    println(listValidator.validate(listOf<Int?>(1, 2, 3))) // true
    println(listValidator.validate(listOf<Int?>(1, null, 3))) // false
    println(listValidator.validate(listOf<Int?>(1, 0, 3))) // false
}