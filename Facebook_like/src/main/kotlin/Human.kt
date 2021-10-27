open class Human (
    var age: Int,
    val firstName: String,
    val name: String,
) {
    fun seeHuman()
    {
        println("$firstName, $name, $age")
    }
}

class Man (
    age: Int,
    firstName: String,
    name: String,
) : Human (
    age,
    firstName,
    name
) {
}

class Woman (
    age: Int,
    firstName: String,
    name: String,
) : Human (
    age,
    firstName,
    name
){
}