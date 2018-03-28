fun main(args : Array<String>) {
    val temp = 37.5
    val count : Int = 5
    var name = "Sam"

    name = "Fred"

    fun calculateTemp(celsius : Double) : Double {
        return 9/5 * celsius + 32
    }

    println("Temp = ${calculateTemp(20.0)}")
    println("Temp = ${calculateTemp(50.0)}")

    val intValue = "32".toInt()
    println("intValue = $intValue")

    val intString = 32.toString()
    println("intString = $intString")

    val fanrenheit = 32
    when (fanrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("getting colder")
        in 41..80 -> println("bit hotter")
    }

    var nullableName : String? = null
    var len = nullableName?.length ?: -1
    println(len)
    nullableName = "Sam"
    len = nullableName?.length ?: -1
    println(len)
}