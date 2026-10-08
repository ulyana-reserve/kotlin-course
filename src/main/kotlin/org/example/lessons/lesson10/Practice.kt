package org.example.lessons.lesson10

val emptyNotMutable: Map<String, Int> = mapOf()
val emptyNotMutableEmptyMap: Map<String, Int> = emptyMap()

val numbersAndStrings: Map<Int, String> = mapOf(1 to "one", 2 to "two")
val mutableMap = mutableMapOf("String1" to "String2")

val mapOne = mapOf("StrinMyMap1" to 1, "StringMyMap2" to 2)
val mapTwo = mapOf("StrinMyMap1.2" to 12, "StringMyMap2.2" to 22, "StringMyMap2" to 10)
val mutableMapTree: MutableMap<String, Int> = mutableMapOf()

val setMap = mapOf(setOf("StringSet1") to 10 , setOf("StringSet2", "StringSet3") to 11)

fun main() {
    println(setMap[setOf("StringSet1")])


    mutableMap.put("key1", "value1")
    mutableMap["key2"] = "value2"
    mutableMap.remove("key1")
//    println(mutableMap)
//    for ((key, value) in mutableMap) {
//        println("$key: $value")
//    }
//    printValue("String1")
//    printValue("String10000000")

    mutableMap["String1"] = "newString1"
//    println(mutableMap)

    for ((key, value) in mapOne) {
        mutableMapTree[key] = value
    }
    for ((key, value) in mapTwo) {
//        if (key in mutableMapTree) continue
        mutableMapTree[key] = value
    }

//println(mutableMapTree)
}

fun printValue(myKey: String) {
    var isFound: Boolean = false
    for ((key, value) in mutableMap) {
        if (key == myKey) {
            println(value)
            isFound = true
            break
        }
    }
    if (!isFound) {
        println("Not found")
    }
}