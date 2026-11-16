package org.example.lessons.lesson19.homework.classes

import org.example.lessons.lesson19.homework.interfaces.Validator

/*
9. Создай класс ListValidator с дженериком, ограниченным типом Number,
имплементируй интерфейс Validator типизированный по типу List
с nullable типом дженерика класса.

Реализуй проверку:
1. Ни один элемент списка не является null.
2. Ни один элемент, приведённый к типу Double, не равен 0.0.
*/
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(element: List<T?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}