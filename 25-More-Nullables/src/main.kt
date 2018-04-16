fun main(args: Array<String>) {
    var result: Int? = 30
    println(result)

    // We have to use the .plus() function on our nullable objects as + 1 does not work
    val newResult = result?.plus(5)
    println(newResult)

    // We can use !! (not null assertion operator) to force the + to work
    println(result!! + 1)

    var x : Int? = null
    if (x != null) {
        x += 1
    }
/*
The below commented code does not do anything
 */
//    else {
//        x?.plus(1)
//    }
    println(x)

    var authorName: String? = "Kevin Moore"
    var authorAge: Int? = 30

    // Forces the value to be evaluated
    var unwrappedAuthorName = authorName!!
    println("Author is $unwrappedAuthorName")

//    authorName = null
//    // Using !! gives a NullPointerException
//    println("Author is ${authorName!!}")

    // Below is the standard way to check if a var is null and what to do
    if (authorName != null) {
        println("Author is $authorName")
    } else {
        println("There is no author...")
    }

    // Kotlin has a unique way to do the above
    authorName?.let {
        name -> println("Our author is $name")
    }

    // Or we can use the default parameter "$it"
    authorName?.let {
        println("Our author is $it")
    }


    var nullableInt : Int? = 10
    // If the nullable object is null, set it to 0. Otherwise set it to the nullableInt value.
    var mustHaveResult = nullableInt ?: 0

    println(mustHaveResult)


}