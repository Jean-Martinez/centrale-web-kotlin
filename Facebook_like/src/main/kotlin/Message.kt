class Message (
    val author: Person,
    var content: String,
    val date: String
) {
    fun printMessage()
    {
        println("Message de ${author.firstName} :")
        println("'$content'")
    }
}