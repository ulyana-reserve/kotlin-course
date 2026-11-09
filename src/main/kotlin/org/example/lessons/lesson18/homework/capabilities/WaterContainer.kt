package org.example.lessons.lesson18.homework.capabilities

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}
