package oop

fun main() {
    println("person1 is instantiated")
    val person1 = Person2("joe", 25)

    println("person2 is instantiated")
    val person2 = Person2("Jack")

    println("person3 is instantiated")
    val person3 = Person2()
}

class Person2(_firstName: String = "UNKNOWN", _age: Int = 0) { // valores no parametros são padrão
    val firstName = _firstName.replaceFirstChar { it.lowercase() }
    var age = _age
    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}