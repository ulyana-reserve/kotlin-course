package org.example.lessons.lessons22

/*

  Задание 11. Создай свой тип исключения в отдельном файле,
  наследуемый от AssertionError и принимающий текст.
  */
class CustomAssertionError(message: String) : AssertionError(message)