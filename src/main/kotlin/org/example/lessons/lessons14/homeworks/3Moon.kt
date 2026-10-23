package org.example.lessons.lessons14.homeworks


//object в Kotlin используется для создания синглтонов, то есть классов, которые могут иметь только один экземпляр.

/*
Природное явление: луна. Создайте объект Moon,
который будет представлять Луну.
Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
 и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
 Добавьте метод showPhase(), который выводит текущую фазу Луны.
 */

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println("The moon is visible and the phase is $phase")
        } else
            println("The moon is not visible now, try later")
    }
}

fun main() {
    Moon.showPhase()
}