package org.example.lessons.lesson19.homework.classes

import org.example.lessons.lesson19.homework.interfaces.Validator

/*
8. Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
Реализуй проверку, что число чётное.
*/
class OddValidator : Validator<Int> {
    override fun validate(element: Int): Boolean {
        return element % 2 == 0
    }
}