package Poo

class Person(val name: String, var age: Int)

fun main() {
    val person = Person("John", 30)

    println("Name: ${person.name}")
    println("Age: ${person.age}")
}
