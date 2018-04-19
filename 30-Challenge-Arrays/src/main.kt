/**
 *
 */
fun main(args: Array<String>) {
/*
 ### ARRAYS
 Use index(of:) to determine the position of the element "Dan" in players.
*/

    var players = arrayOf("Alice", "Ben", "Carla", "Dan")

    println(players.indexOf("Dan"))

/*
  Write a for-in loop that prints the players' names and scores.
*/

    var scores = arrayOf(2,4,6,8)
    var index = 0
    for (player in players) {
        println("Player $player has a score of ${scores[index]}")
        index++
    }

    println("-------------------------------------")

/*
  Use the forEachIndexed method of an array to print the players' names and scores.
 */
    players.forEachIndexed{
        index, player ->  println("Player $player has a score of ${scores[index]}")

    }
}