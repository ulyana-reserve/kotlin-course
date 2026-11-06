package org.example.lessons.lesson17.homework.questions

abstract class BaseClass(
    /*  1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
privateVal родителя не доступен потомку. В main доступна одноименная переменная от Child
 */
    private val privateVal: String,

    /*2. объясни, почему это поле недоступно в main()
    protectedVal виден только в BaseClass и его наследниках, но не из main через объект
     */
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main() - это НЕВОЗМОЖНО" +
            "без изменения базового класса, а его запретили измеять"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    /*7. объясни, почему эта функция не может быть публичной
    getProtectedClass() возвращает ProtectedClass, а этот тип protected.
 *    то есть если бы мы открыли эту фунцию, то мы могли бы вызывать ее из main, но при этом не могли бы видеть
 результат вызова тк он protected - > доступен только детям
     */
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    /* 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    мы этот метод вызываем от объекта ребенка, а он в ребенке переопределен
     */
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    /*9. объясни, почему эта функция не может быть публичной или protected
    Потому что она возвращает приватный класс
     */
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    /* 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    Тк это публичный параметр конструктора
     */
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    /* 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    getAll() унаследован от BaseClass, поэтому доступен через ChildrenClass.*/

    /* 12. проверь, что выводится на печать при вызове функции printText()
    и объясни, почему не происходит переопределение метода privatePrint()
    * printText() напечатает «Печать из класса BaseClass»: privatePrint() не
    *     open и потому не переопределяется. privatePrint() потомка — независимый метод.
    */
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}