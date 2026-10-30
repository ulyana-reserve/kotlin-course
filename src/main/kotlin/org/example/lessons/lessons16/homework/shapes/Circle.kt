package org.example.lessons.lessons16.homework.shapes

import kotlin.math.PI

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}