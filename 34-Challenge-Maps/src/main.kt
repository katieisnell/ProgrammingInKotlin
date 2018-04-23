/**
 *
 */

fun main(args: Array<String>) {

/*
 ### Maps

 Create a Map with the following keys: name, profession, country, state, and city.
 For the values, put your own name, profession, country, state, and city.
 */

    val katie = mutableMapOf("name" to "Katie",
            "profession" to "Student",
            "country" to "UK",
            "state" to "Greater London",
            "city" to "London")

    println(katie)
    
/*
 You suddenly decide to move to Albuquerque.
 Update your city to Albuquerque, your state to New Mexico,
 and your country to USA.
 */

    katie["city"] = "Albuquerque"
    katie["state"] = "New Mexico"
    katie["country"] = "USA"

/*
Given a Map in the above format, write a function that
prints a given player's city and state.
*/

    fun printCityAndState(player: Map<String, String>) {
        println("${player["name"]}'s city and state is ${player["city"]} and ${player["state"]}")
    }

    printCityAndState(katie)

}