fun main(args: Array<String>) {

    val ints = listOf(2, 5, 20, 50)
    println(ints.filter { it > 10})

    // Compiles and runs as expect without the need of the following function
    fun List<Int>.filter(operator: (Int) -> Boolean) {}

    val myStringList = listOf("Sam", "Toby", "Tim", "Katie")
    val updatedList = myStringList.filter { it.length > 3 }.sortedBy { it }
    println(updatedList)

}