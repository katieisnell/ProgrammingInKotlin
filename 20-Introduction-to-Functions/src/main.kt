fun main(args: Array<String>) {

    fun printMyName() {
        println("My name is Katie")
    }

    printMyName()

    fun printMultiplesOfFive(value: Int) {
        println("$value * 5 = ${value * 5}")
    }

    // Below calls give the same output
    printMultiplesOfFive(10)
    printMultiplesOfFive(value = 10)

    fun printMultipleOf(multiplier: Int, addValue: Int) {
        println("$multiplier * $addValue = ${multiplier * addValue}")
    }

    printMultipleOf(4, 2)

    // By including "= 1", we specify a default value if the function is called without that argument
    fun printMultipleOf2(multiplier: Int, value: Int = 1) {
        printMultipleOf(multiplier, value)
    }

    // Prints 8
    printMultipleOf2(4, 2)
    // Prints 4
    printMultipleOf2(4)

    // We can specify a return type in our functions
    fun multiply(number: Int, multiplier: Int) : Int {
        return number * multiplier
    }

    println(multiply(4,2))

    fun multiplyAndDivide(number: Int, factor: Int) : Pair<Int, Int> {
        return Pair(number * factor, number / factor)
    }

    println("Multiply and divide: ${multiplyAndDivide(4, 2)}")
}