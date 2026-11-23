package org.example.lessons.lessons22

/*


Задание 12. Создай свой тип исключения в отдельном файле,
наследуемый от RuntimeException и принимающий IndexOutOfBoundsException
в качестве аргумента.
*/
class CustomIndexException(cause: IndexOutOfBoundsException) :
    RuntimeException("Ошибка выхода индекса за границы", cause)
