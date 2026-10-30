package org.example.lessons.lessons16.homework

class Logger {
    fun log(message: String) {
        log("INFO", message)
    }

    fun log(level: String, message: String) {
        when (level) {
            "INFO" ->
                println("${Colors.GREEN}ℹ️ [INFO] $message${Colors.RESET}")

            "WARNING" ->
                println("${Colors.YELLOW}⚠️ [WARNING] $message${Colors.RESET}")

            "ERROR" ->
                println("${Colors.WHITE}${Colors.BRIGHT_RED_BACKGROUND}❌ [ERROR] $message${Colors.RESET}")

            "DEBUG" ->
                println("${Colors.BLUE}🔍 [DEBUG] $message${Colors.RESET}")

            else ->
                println("[$level] $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        val message = exception.message ?: "У ошибки нет сообщения"
        log("ERROR", message)
    }
}
fun main() {
    val logger = Logger()

    logger.log("WARNING", "Мало свободного места")
    logger.log("Приложение запущено")
    logger.log("ERROR", "Не удалось сохранить файл")
    logger.log("DEBUG", "Начинаю проверку данных")


    logger.log(listOf(
        "Пользователь вошёл в систему",
        "Данные загружены"
    ))


    logger.log(Exception("Неожиданная ошибка"))
}
