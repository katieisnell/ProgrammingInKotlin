/**
 *
 */
fun main(args: Array<String>) {
/*
 ### MORE Nullables

 Using your `myFavoriteSong` variable from the previous challenge,
 use nullable safe calls and let to check if it contains a value.
 If it does, print out the value. If it doesn’t, print "I don’t have a favorite song."
 */

    var myFavSong : String? = null

    myFavSong?.let {
        println(myFavSong)
    } ?: println("I don’t have a favorite song...")

    /*
     Write a function called `printNickname` that takes a Nullable String as a parameter.
     Use the `let` method to try to unwrap the nickname, and if it fails print an error
     and return. Otherwise, print the unwrapped nickname.
     */
    fun printNickname(nickname: String?) {
        nickname?.let {
            println("nickname = $it")
        } ?: println("Error finding nickname...")
    }

    printNickname(null)
    printNickname("Johnny")



}