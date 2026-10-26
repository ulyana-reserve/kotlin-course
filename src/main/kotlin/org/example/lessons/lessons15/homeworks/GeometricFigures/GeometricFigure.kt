package org.example.lessons.lessons15.homeworks.GeometricFigures

open class GeometricFigure(
    val color: String,
    val isFilled: Boolean
) {
    fun describe() {
        println("Цвет: $color, фигура закрашена: $isFilled")
    }
}

open class Polygon(
    color: String,
    isFilled: Boolean,
    val sideCount: Int
) : GeometricFigure(color, isFilled)

class Circle(
    color: String,
    isFilled: Boolean,
    val radius: Double
) : GeometricFigure(color, isFilled)

class Triangle(
    color: String,
    isFilled: Boolean,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(color, isFilled, 3)

class Quadrilateral(
    color: String,
    isFilled: Boolean,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sideD: Double
) : Polygon(color, isFilled, 4)