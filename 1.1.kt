data class Person(val name: String, val age: Int? = null)

fun main() {


    val Alice = Person(name = "Alice")
    val Bob = Person(name = "Bob", age = 29)

    val persons = listOf(Alice, Bob)
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("The oldest is: $oldest")
}