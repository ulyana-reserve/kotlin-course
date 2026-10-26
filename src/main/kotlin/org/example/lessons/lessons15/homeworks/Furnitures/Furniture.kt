package org.example.lessons.lessons15.homeworks.Furnitures

open class Furniture(
    val material: String,
    val manufacturer: String
)

open class SeatingFurniture(
    material: String,
    manufacturer: String,
    val seatCount: Int
) : Furniture(material, manufacturer)

class Chair(
    material: String,
    manufacturer: String,
    val hasArmrests: Boolean
) : SeatingFurniture(material, manufacturer, 1)

class Sofa(
    material: String,
    manufacturer: String,
    seatCount: Int,
    val foldsOut: Boolean
) : SeatingFurniture(material, manufacturer, seatCount)

open class Table(
    material: String,
    manufacturer: String,
    val legCount: Int
) : Furniture(material, manufacturer)

class DiningTable(
    material: String,
    manufacturer: String,
    legCount: Int,
    val shape: String
) : Table(material, manufacturer, legCount)

class Cabinet(
    material: String,
    manufacturer: String,
    val shelfCount: Int
) : Furniture(material, manufacturer)