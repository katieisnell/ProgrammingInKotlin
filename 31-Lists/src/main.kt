fun main(args: Array<String>) {
    // An immutable list of names
    val names = listOf("Anna", "Brian", "Craig", "Donna")

    // A mutable list of names
    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    println(teamNames)

    teamNames.add("Sam")
    teamNames.add("Jan")

    println(teamNames[0])

    println(teamNames.indexOf("Brian"))

    teamNames.remove("Craig")
    println(teamNames)

    for (name in teamNames) {
        println("Team member: $name")
    }

}