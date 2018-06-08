fun main(args: Array<String>) {

    // A simple function that applies the "operation" function onto "myInt"
    fun handleInteger(myInt: Int, operation: (Int) -> Unit) {
        operation(myInt)
    }

    handleInteger(5, {println("My result is ${it * 10}")})

    // Explicit definition of myType
    handleInteger(5, {myType -> println("My explicit result is ${myType * 20}")})

    // If you do not want to use the "it", you can replace with an _
    handleInteger(5, {_ -> println("I am not using the result...")})


    fun printResult(myInt: Int) {
        println("My int is $myInt")
    }

    // The :: represents a point to that function
    handleInteger(4, ::printResult)
}