fun main(args : Array<String>) {
    val coords = Pair(2, 3)
    val (x, y) = coords
    println("x = $x y = $y")

    println("x = ${coords.first} y = ${coords.second}")

    val coordsDoubles = Pair(2.1, 3.5)
    println("x = ${coordsDoubles.first} y = ${coordsDoubles.second}")

    val coordsMixed = Pair(2.1, 3)
    println("x = ${coordsMixed.first} y = ${coordsMixed.second}")

    val x1 = coords.first
    val y1 = coords.second
    println("x1 = ${x1} y1 = ${y1}")

    val coords3D = Triple(2,3,1)
    val (x3, y3, z3) = coords3D
    println("x3 = $x3 y3 = $y3 z3 = $z3")

    val (x4, y4, _) = coords3D
    println("x4 = $x4 y4 = $y4")
}