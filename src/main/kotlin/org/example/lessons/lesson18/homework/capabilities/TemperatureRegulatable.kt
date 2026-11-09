package org.example.lessons.lesson18.homework.capabilities

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}
