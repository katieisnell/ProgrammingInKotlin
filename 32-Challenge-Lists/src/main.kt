/**
 *
 */
fun main(args: Array<String>) {
/*
 ### Lists
 Create a list with the following states that you have lived in:
 */

    val states = mutableListOf<String>()
    states.add("London")
    states.add("Surrey")
    states.add("Manchester")
    states.add("Galway")


/*
Given a function to print out all states but the third one
*/
    fun printStates(states: List<String>) {
        for (state in states) {
            // The 3rd state has index of 2
            if (states.indexOf(state) != 2)
                println(state)
        }
    }

    printStates(states)


}