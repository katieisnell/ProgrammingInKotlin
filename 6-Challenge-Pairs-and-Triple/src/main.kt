/**
 *
 */
fun main(args: Array<String>) {
/* Pairs and Triples

 Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
 */
    val myPair = Pair(12, 25)

/*
 In one line, read the day and month values into two constants.
 */
    val (month, day) = myPair

/*
 Now create a Triple using the month, day and year */
    val myTriple = Triple(month, day, 2000)

}