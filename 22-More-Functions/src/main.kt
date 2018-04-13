typealias operation = (Int, Int) -> Int

fun main(args: Array<String>) {
    // Example of overloading; many functions have the same name but different parameters
    fun printMultiple(multiplier: Int, value: Int) {}
    fun printMultiple(multiplier: Int, value: Int, nextValue: Int) {}
    fun printMultiple(multiplier: Int, value: Int, nextValue: Int, anotherValue: Int) {}

    fun getValue() : Int {
        return 31
    }

    /*
    Cannot have a function with the same name and different return type
     */
//    fun getValue() : String {
//        return "Katie"
//    }


    fun incrementAndPrint(value: Int) {
        // Cannot directly manipulate a function parameter
        //value += 1
        println(value)
    }

    fun add(a: Int, b: Int) : Int {
        return a + b
    }

    var function : (Int, Int) -> Int = ::add

    println(function(4,2))

    fun subtract(a: Int, b: Int) : Int {
        return a - b
    }

    function = ::subtract

    println(function(4,3))

    // We can define a function parameter list to include a function, and then we are able to use that function in the method
    fun printResults(function: (Int, Int) -> Int, a: Int, b: Int) {
        val result = function(a,b)
        println(result)
    }

    printResults(::add, 5, 3)

    fun anotherPrintResults(function: operation, a: Int, b: Int) {
        val result = function(a,b)
        println(result)
    }

    anotherPrintResults(::subtract, 8,3)

    // Kotlin's default type is "Unit", which means it does not return anything (below it is explicitly define)
    fun noReturn() : Unit {
        println("This function doesn't return anything...")
    }

    noReturn()

}