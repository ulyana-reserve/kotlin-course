package org.example.lessons.lessons15.homeworks.EducationalInstitutions

open class EducationalInstitution(
    val name: String,
    val address: String
) {
    fun showAddress() {
        println("$name находится по адресу: $address")
    }
}

open class School(
    name: String,
    address: String,
    val gradeCount: Int
) : EducationalInstitution(name, address)

class PrimarySchool(
    name: String,
    address: String,
    gradeCount: Int,
    val hasAfterSchoolCare: Boolean
) : School(name, address, gradeCount)

class SecondarySchool(
    name: String,
    address: String,
    gradeCount: Int,
    val hasFinalExams: Boolean
) : School(name, address, gradeCount)

open class College(
    name: String,
    address: String,
    val studyDurationYears: Int
) : EducationalInstitution(name, address)

class TechnicalCollege(
    name: String,
    address: String,
    studyDurationYears: Int,
    val specialty: String
) : College(name, address, studyDurationYears)

class University(
    name: String,
    address: String,
    val facultyCount: Int
) : EducationalInstitution(name, address)