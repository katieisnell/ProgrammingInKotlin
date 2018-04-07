fun main(args: Array<String>) {
    var range = 0..5

    val count = 10
    var sum = 0
    // NOTICE: We do not have to declare i are a var
    for (i in 1..count) {
        sum += i
    }
    println("sum = $sum")

    for (i in 0..count)
        println("Hodor!!!")

    for (i in 1..count) {
        if (i % 2 == 1)
            println("$i is odd")
    }

    for (i in 1..count) {
        println("$i. Hello")
        // Ignores the rest of the code in the current loop, and skips to the next iteration
        if (i == 3)
            continue
        println("$i. Goodbye")
    }

    for (row in 1..3) {
        for (column in 1..3) {
            print(column)
        }
        println()
    }

    println("---")

    // Using labels, we can "jump" to the code that the label references
    outer@ for(row in 1..3) {
        for (column in 1..3) {
            if (row == 2 && column == 2) {
                println()
                continue@outer
            }
            print(column)
        }
        println()
    }
}