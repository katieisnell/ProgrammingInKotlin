fun main(args: Array<String>) {
    // The "?" tells the compiler that this string can be null, and so it must be initialised to null or a value
    var nickname: String? = null

    fun printNickname(nickname: String?) {
        println("Nickname is $nickname")
    }

    printNickname(nickname)

    nickname = "Kt"
    printNickname(nickname)
}