interface Repository<T> {
    fun addItem(item: T)
    fun deleteItem(item: T)
}

class Person(val name: String) {}

class PersonRepo : Repository<Person> {
    override fun addItem(item: Person) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteItem(item: Person) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


fun <T> printItem(item: T) {
    println(item)
}

// Don't have to use T for generic types, it is just tradition
fun <MyItem> printAnotherItem(item: MyItem) {
    println("example function")
}



fun main(args: Array<String>) {
    printItem("print me!")
}