package hello

data class Person3(val name: String,val age: Int? = null)

fun main3(args: Array<String>) {
    val persons = listOf(Person3("Alice"),
                         Person3("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)
