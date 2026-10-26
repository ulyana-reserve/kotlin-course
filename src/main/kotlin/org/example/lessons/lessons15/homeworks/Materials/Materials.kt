package org.example.lessons.lessons15.homeworks.Materials

abstract class Materials {
    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, material ->
            println("[$index]: $material")
        }
    }
}

class AddToBottom : Materials() {
    fun addAtBottom(material: String) {
        val existing = extractMaterials()

        addMaterial(material)
        existing.forEach { addMaterial(it) }
    }
}
class InsertInterleaved : Materials() {
    fun insertAtBeginningInterleaved(newMaterials: List<String>) {
        val existing = extractMaterials()
        val maxSize = maxOf(newMaterials.size, existing.size)

        for (index in 0 until maxSize) {
            if (index < newMaterials.size) {
                addMaterial(newMaterials[index])
            }
            if (index < existing.size) {
                addMaterial(existing[index])
            }
        }
    }
}

class AddAndSort : Materials() {
    fun addAndSort(material: String) {
        val allMaterials = extractMaterials() + material

        allMaterials
            .sorted()
            .forEach { addMaterial(it) }
    }
}

class AddMapEntries : Materials() {
    fun addEntries(entries: Map<String, String>) {
        val existing = extractMaterials()

        entries.keys
            .toList()
            .asReversed()
            .forEach { addMaterial(it) }

        existing.forEach { addMaterial(it) }

        entries.values.forEach { addMaterial(it) }
    }
}