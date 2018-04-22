fun main(args: Array<String>) {
    var namesAndScores = mapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)

    // Prints Anna's score 2
    println(namesAndScores["Anna"])

    // Printing a score of someone who doesn't exist gives us null
    println(namesAndScores["Greg"])

    println(namesAndScores.isEmpty())

    // Prints how many items there are in the map
    println(namesAndScores.count())

    val bobData = mutableMapOf("name" to "Bob",
            "profession" to "Card PLayer",
            "city" to "Oakland",
            "country" to "USA")

    println(bobData)

    // Changes his profession
    bobData["profession"] = "Mailman"
    println(bobData)

    // Removes the "city" key
    bobData.remove("city")
    println(bobData)

    // We can deconstruct the values
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    // Needs .keys in order to call namesAndScores[player]
    for (player in namesAndScores.keys) {
        println("$player, ${namesAndScores[player]}")
    }

}