package org.example.lessons.lessons16.homework.animals_and_sounds

abstract class Animal {
    open fun makeSound(){
        println("${Colors.BOLD}${Colors.BRIGHT_RED_BACKGROUND} \uD83D\uDC3E✨ This animal makes no ⛔ sound.${Colors.RESET}")
    }
}