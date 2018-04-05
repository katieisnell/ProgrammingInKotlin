fun main(args: Array<String>) {
    var i = 1;
    while (i < 10) {
        print(i)
        i += 1
    }
    println("---")

    i = 1
    do {
        print(i)
        i += 1
    } while (i < 10)
    println("---")

    i = 1
    do {
        print(i)
        // Can exit a loop earlier with the keyword "break"
        if (i == 5)
            break
        i += 1
    } while (i < 10)
}