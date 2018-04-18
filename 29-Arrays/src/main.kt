fun main(args: Array<String>) {
    val evenNumbers1 = arrayOf(2,4,6,8)

    // We can define explicitly the type in our array
    val evenNumbers2: Array<Int> = arrayOf(2,4,6,8)
    val intNumbers = intArrayOf(2,4,6,8)

    val players = arrayOf("Alice", "Bob", "Cindy", "Dan")

    if (players.size < 2) {
        println("We need more players")
    } else {
        println("Lets start!")
    }

    // Prints true or false
    println(players.isEmpty())

    // Prints the value at the first index
    println(players.first())

    val firstPlayer = players[0]
    println("First player is $firstPlayer")

    // sliceArray creates a new array from the indices defined
    val upcomingPlayers = players.sliceArray(0..2)
    for (player in upcomingPlayers) {
        println(player)
    }


    fun isEliminated(player: String) : Boolean {
        return !players.contains(player)
    }

    // Prints false
    println(isEliminated("Bob"))
    // Prints true
    println(isEliminated("Steven"))

    // Changes the string at index 2 to be Carla
    players[2] = "Carla"
    for (player in players) {
        println(player)
    }

    fun suomOfAllItems(array: Array<Int>) : Int {
        var sum = 0
        for (number in array) {
            sum += number
        }
        return sum
    }

    println(suomOfAllItems(arrayOf(2,5,7,8)))

    val prices = arrayOf(1,5,20,50)
    // Removes the first 1 values
    val removeFirst1Item = prices.drop(1)
    println(removeFirst1Item)

    // Removes the first 2 values
    val removeFirst2Items = prices.drop(2)
    println(removeFirst2Items)

    // Removes the last 1 values
    val removeLast1Item = prices.dropLast(1)
    println(removeLast1Item)
}