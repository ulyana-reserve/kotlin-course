package org.example.lessons.lesson13.homework

class Homework {
    /*
Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
Определите среднее время выполнения теста.
*/
    fun getAverageTestTime(testTimes: Map<String, Double>): Double {
        return testTimes.values.average()
    }

    /*
    Имеется словарь с метаданными автоматизированных тестов,
    где ключи — это имена тестовых методов, а значения — строка с метаданными.
    Выведите список всех тестовых методов.
    */
    fun printTestMethodNames(testMetadata: Map<String, String>) {
        println(testMetadata.keys)
    }

    /*
    В изменяемый словарь с данными о прохождении тестов
    добавьте новый тест и его результат.
    */
    fun addTestResult(
        testResults: MutableMap<String, String>,
        testName: String,
        result: String
    ) {
        testResults.put(testName, result)
    }

    /*
    Посчитайте количество успешных тестов в словаре с результатами
    (ключ — название, значение — результат из passed, failed, skipped).
    */
    fun countSuccessfulTests(testResults: Map<String, String>): Int {
        return testResults.count { it.value == "passed" }
    }

    /*
    Удалите из изменяемого словаря с баг-трекингом запись о баге,
    который был исправлен (ключ — название, значение — статус исправления).
    */
    fun removeFixedBug(bugTracker: MutableMap<String, String>, bugName: String) {
        bugTracker.remove(bugName)
    }

    /*
    Для словаря с результатами тестирования веб-страниц
    (ключ — URL страницы, значение — статус ответа),
    выведите сообщение о странице и статусе её проверки.
    */
    fun printPageTestResults(pageResults: Map<String, Int>) {
        pageResults.forEach { (url, status) ->
            println("Страница $url: статус проверки $status")
        }
    }

    /*
    Найдите в словаре с названием и временем ответа сервисов
    только те, время ответа которых превышает заданный порог.
    */
    fun findSlowServices(
        responseTimes: Map<String, Double>,
        threshold: Double
    ): Map<String, Double> {
        return responseTimes.filter { it.value > threshold }
    }

    /*
    В словаре хранятся результаты тестирования API
    (ключ — endpoint, значение — статус ответа в виде строки).
    Для указанного endpoint найдите статус ответа,
    если endpoint отсутствует, предположите, что он не был протестирован.
    */
    fun getApiStatus(
        apiResults: Map<String, String>,
        endpoint: String
    ): String {
        return apiResults.getOrElse(endpoint) { "не тестировался" }
    }

    /*
    Из словаря, содержащего конфигурации тестового окружения
    (ключ — название параметра конфигурации, значение — сама конфигурация),
    получите значение для "browserType". Ответ не может быть null.
    */
    fun getBrowserType(configuration: Map<String, String>): String {
        return configuration.getValue("browserType")
    }

    /*
    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО,
    добавив новую версию.
    */
    fun addVersion(
        versions: Map<String, String>,
        versionName: String,
        version: String
    ): Map<String, String> {
        return versions + (versionName to version)
    }

    /*
    Используя словарь с настройками тестирования для различных мобильных устройств
    (ключ — модель устройства, значение — строка с настройками),
    получите настройки для конкретной модели или верните настройки по умолчанию.
    */
    fun getDeviceSettings(
        deviceSettings: Map<String, String>,
        model: String,
        defaultSettings: String
    ): String {
        return deviceSettings.getOrDefault(model, defaultSettings)
    }

    /*
    Проверьте, содержит ли словарь с ошибками тестирования
    (ключ — код ошибки, значение — описание ошибки) определенный код ошибки.
    */
    fun containsErrorCode(errors: Map<Int, String>, errorCode: Int): Boolean {
        return errors.containsKey(errorCode)
    }

    /*
    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
    в формате "TestID_Version", а значения — статусы выполнения этих тестов
    ("Passed", "Failed", "Skipped").
    Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых
    соответствуют определённой версии тестов, то есть в ключе содержится
    требуемая версия.
    */
    fun filterScenariosByVersion(
        scenarios: Map<String, String>,
        requiredVersion: String
    ): Map<String, String> {
        return scenarios.filterKeys { it.contains(requiredVersion) }
    }

    /*
    У вас есть словарь, где ключи — это названия функциональных модулей приложения,
    а значения — результаты их тестирования.
    Проверьте, есть ли модули с неудачным тестированием.
    */
    fun hasFailedModule(moduleResults: Map<String, String>): Boolean {
        return moduleResults.any { it.value == "failed" }
    }

    /*
    Добавьте в изменяемый словарь с настройками тестовой среды
    настройки из другого словаря.
    */
    fun addEnvironmentSettings(
        environmentSettings: MutableMap<String, String>,
        additionalSettings: Map<String, String>
    ) {
        environmentSettings.putAll(additionalSettings)
    }

    /*
    Объедините два неизменяемых словаря с данными о багах.
    */
    fun mergeBugDictionaries(
        firstBugs: Map<String, String>,
        secondBugs: Map<String, String>
    ): Map<String, String> {
        val mergedBugs: MutableMap<String, String> = firstBugs.toMutableMap()

        for ((bugName, status) in secondBugs) {
            mergedBugs[bugName] = status
        }

        return mergedBugs
    }

    /*
    Очистите изменяемый словарь с временными данными
    о последнем прогоне автоматизированных тестов.
    */
    fun clearLastRunData(lastRunData: MutableMap<String, String>) {
        lastRunData.clear()
    }

    /*
    Исключите из отчета по автоматизированному тестированию те случаи,
    где тесты были пропущены (имеют статус “skipped”).
    Ключи — название теста, значения — статус.
    */
    fun excludeSkippedTests(testReport: Map<String, String>): Map<String, String> {
        return testReport.filterValues { it != "skipped" }
    }

    /*
    Создайте копию словаря с конфигурациями тестирования,
    удалив из него несколько конфигураций.
    */
    fun copyWithoutConfigurations(
        configurations: Map<String, String>,
        configurationNamesToRemove: List<String>
    ): Map<String, String> {
        return configurations - configurationNamesToRemove
    }

    /*
    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
    (ключ — идентификатор теста, значение — результат)
    в список строк формата "Test ID: результат".
    */
    fun createTestReport(testResults: Map<String, String>): List<String> {
        return testResults.map { (testId, result) -> "Test $testId: $result" }
    }

    /*
    Преобразуйте изменяемый словарь с результатами последнего тестирования
    в неизменяемый для архивации.
    */
    fun archiveTestResults(lastTestResults: MutableMap<String, String>): Map<String, String> {
        return lastTestResults.toMap()
    }

    /*
    Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
    заменив идентификаторы тестов на их строковый аналог (например, через toString()).
    */
    fun convertTestIdsToStrings(
        executionTimes: Map<Int, Double>
    ): Map<String, Double> {
        return executionTimes.mapKeys { it.key.toString() }
    }

    /*
    Для словаря с оценками производительности различных версий приложения
    (ключи — строковая версия, значения — дробное число времени ответа сервера)
    увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    */
    fun increaseResponseTimes(
        responseTimesByVersion: Map<String, Double>
    ): Map<String, Double> {
        return responseTimesByVersion.mapValues { it.value * 1.1 }
    }

    /*
    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    */
    fun hasNoCompilationErrors(compilationErrors: Map<String, String>): Boolean {
        return compilationErrors.isEmpty()
    }

    /*
    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    */
    fun hasLoadTestResults(loadTestResults: Map<String, String>): Boolean {
        return loadTestResults.isNotEmpty()
    }

    /*
    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    */
    fun haveAllTestsPassed(testResults: Map<String, String>): Boolean {
        return testResults.all { it.value == "passed" }
    }

    /*
    Определите, содержит ли словарь с результатами тестирования
    хотя бы один тест с ошибкой.
    */
    fun containsFailedTest(testResults: Map<String, String>): Boolean {
        return testResults.containsValue("failed")
    }

    /*
    Отфильтруйте словарь с результатами тестирования сервисов,
    оставив только те тесты, которые не прошли успешно
    и содержат в названии “optional”.
    */
    fun filterOptionalFailedTests(
        serviceTestResults: Map<String, String>
    ): Map<String, String> {
        return serviceTestResults.filterNot {
            !it.key.contains("optional") || it.value == "passed"
        }
    }
}