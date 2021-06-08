package hello

data class Person1(val name: String,val age: Int? = null)

fun main1(args: Array<String>) {
    val persons = listOf(Person1("Alice"),
                         Person1("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)


