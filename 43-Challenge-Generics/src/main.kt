/**
 *
 */
fun main(args: Array<String>) {

    /**
     * Create a function named printItem that prints out a generic parameter.
     * Call the parameter "item"
     */

    fun <T> printItem(item: T) {
        println("Please print $item")
    }

    printItem("cats and dogs")
    printItem(2.6)


    /**
     * Create a function named printList that takes a generic list as a parameter
     * and prints out each item
     */

    fun <T> printList(myList: List<T>) {
        for (item in myList) {
            println("$item")
        }
    }

    printList(listOf("Sally", "Bob", "Jacob", 5))

}