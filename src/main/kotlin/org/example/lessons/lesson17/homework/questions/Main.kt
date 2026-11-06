package org.example.lessons.lesson17.homework.questions

abstract class Main {
    /*



 */

}

fun main() {
    val child = Child("Значение свойства потомка", "protected из родителя", "public из родителя")

    child.publicField = "Антонио Бандерас"
    // 5. protectedField меняется методом changeProtectedField, вызванным из main.
    child.changeProtectedField("Изменено через метод-наследник")
    println(child.getAll())
    child.printText()
    println(child.getAll())
    println("Свойство ChildrenClass privateVal: ${child.privateVal}")

    println("Унаследованное publicVal: ${child.publicVal}")
    // privateField родителя изменить из Child нельзя: он private, а BaseClass менять запрещено.
}