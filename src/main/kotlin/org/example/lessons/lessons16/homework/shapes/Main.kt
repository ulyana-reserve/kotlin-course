package org.example.lessons.lessons16.homework.shapes

class Main {
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(radius = 5.0),
        Square(side = 4.0),
        Triangle(sideA = 3.0, sideB = 4.0, angleDegrees = 90.0)
    )

    for (shape in shapes) {
        println(shape.area())
    }
}