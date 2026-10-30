package org.example.lessons.lessons16.homework.shapes

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}
