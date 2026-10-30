package org.example.lessons.lessons16.homework.animals_and_sounds

class Main {

}
fun main() {
    val animals: List<Animal> = listOf<Animal>(
        Dog(),
        Cat(),
        Bird(),
        Animal()
    )

    for (animal in animals) {
        animal.makeSound()
    }

}