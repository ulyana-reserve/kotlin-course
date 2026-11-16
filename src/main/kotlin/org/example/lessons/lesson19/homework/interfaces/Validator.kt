package org.example.lessons.lesson19.homework.interfaces

/*
6. Напиши интерфейс Validator с дженериком с функцией валидации,
которая будет принимать элемент с типом дженерика и возвращать булево значение.
*/
interface Validator<T> {
    fun validate(element: T): Boolean
}