package org.example.lessons.lessons14.homeworks

/*2 Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
У него должно быть свойство type (String) и intensity (Int).
Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.*/

class Emotion(val type: String, val intensity: Int) {
    fun express(){
        println("I'm feeling $type with intensity level $intensity")
    }
}

fun main() {
    val emotion = Emotion("Sad", 2)
    emotion.express()
}