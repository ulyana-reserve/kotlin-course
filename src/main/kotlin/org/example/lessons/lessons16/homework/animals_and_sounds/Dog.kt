package org.example.lessons.lessons16.homework.animals_and_sounds

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.YELLOW} \uD83D\uDC36 Bark \uD83D\uDD0A ${Colors.RESET}")
    }
}