package org.example.lessons.lesson19.homework.interfaces

/*
3. Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
1. элементов одного типа в элементы другого типа;
2. списка элементов одного типа в список элементов другого типа.
*/
interface Mapper<T, R> {
    fun map(element: T): R
    fun mapList(elements: List<T>): List<R>
}