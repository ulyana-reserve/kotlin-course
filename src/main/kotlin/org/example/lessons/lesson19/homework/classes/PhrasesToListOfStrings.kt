package org.example.lessons.lesson19.homework.classes

import org.example.lessons.lesson19.homework.interfaces.Mapper


/*
4. Создай класс PhrasesToListOfStrings и имплементируй интерфейс Mapper
с типами String и List<String>. Метод преобразования должен разбивать входящую
строку по символу пробела и возвращать список из полученных слов.
Метод преобразования списков — с аналогичной механикой.
*/
class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(element: String): List<String> {
        return element.split(" ")
    }

    override fun mapList(elements: List<String>): List<List<String>> {
        return elements.map { it.split(" ") }
    }
}
