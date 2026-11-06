package org.example.lessons.lesson17.homework.questions

class Child(
    // Это отдельное публичное свойство ChildrenClass. Оно не открывает private-свойство BaseClass.
    val privateVal: String,
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {


    /* Сеттер publicField в BaseClass принимает значение через verifyPublicField. Child
  переопределяет проверку, поэтому строка «Антонио Бандерас» устанавливается.
 */

    override fun verifyPublicField(value: String): Boolean = value.isNotBlank()


    fun changeProtectedField(value: String) {
        protectedField = value
    }

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String = "Это генерация из дочернего класса"
}
