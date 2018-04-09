fun main(args: Array<String>) {
    val number = 10
    // For multiple lines of code after ->, just use the curly braces {}
    when (number) {
        0 -> println("It's zero")
        10 -> println("It's ten")
        else -> println("It's non-zero")
    }

    val string = "Dog"
    when (string) {
        "Dog", "Cat" -> println("We have a house pet")
        else -> println("We do not have a house pet")
    }

    // We can use ranges in "when" statements by adding an "in" condition
    when (number) {
        in 0..9 -> println("Between 0 and 9")
        in 10..20 -> println("Between 10 and 20")
        // else statement is optional, if above are not satisfied code is skipped
    }

    // The "when" statement does not need an argument, acts as an if statement of sorts
    when {
        number % 2 == 0 -> println("even number")
        else -> println("odd number")
    }

    val testVal = 10
    // In this case, we DO have to complete all possible cases of the when statement (i.e. must have an "else")
    val result = when {
        testVal < 10 -> "Less than 10"
        testVal > 10 -> "Greater than 10"
        else -> "Equal to 10"
    }

    println(result)
}