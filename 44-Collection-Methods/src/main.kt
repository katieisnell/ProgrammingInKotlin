fun main(args: Array<String>) {
    val values = listOf(1,2,4,6,7)
    println(values.filter{ it > 5})

    val names = listOf("Sam", "Johny", "Felix", "Bob")
    println(names.first{ it.length > 3})

    val cities = listOf("London", "Los Santos", "New York")
    println(cities.any{ it == "Los Santos"})
    println(cities.all{ it == "Los Santos"})

}