/**
 *
 */
fun main(args: Array<String>) {
    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    val numbers = listOf(1,2,3,4,5,6,7)
    println(numbers.filter{it > 5}.sum())

    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val name: String, val age: Int)
    val sam = Person("Sam", 30)

    println(sam.name)
    println(sam.age)

    val (name, age) = sam
    println("$name is $age years old!")

    /**
     * Print out the index and value of the map below
     */
    val names = mapOf<String,Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)

    for ((name, age) in names) {
        println("$name is $age years old :)")
    }

}