fun main(args: Array<String>) {
    // ArrayList is mutable list
    var name = ArrayList<String>()
    name.add("Sam")
    name.add("Fred")

    fun printNames(names: ArrayList<String>) {
        println(names)
        // Behind the scenes, delete the first name
        names.removeAt(0)
    }

    // Prints both Sam and Fred
    printNames(name)
    // Prints just Fred
    println(name)

    /*
      Now use List<String> in the fun parameter list instead
     */

    fun printNames(names: List<String>) {
        println(names)
        // Now .removeAt() is not allowed
        // names.removeAt(0)
    }

}