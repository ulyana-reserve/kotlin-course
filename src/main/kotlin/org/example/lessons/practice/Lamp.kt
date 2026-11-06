package org.example.lessons.practice

class Lamp() {
    var isTurnedOn = false
        private set

    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    fun getIsTurnedOn(): Boolean {
        return isTurnedOn
    }

}