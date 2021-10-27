class Person (
    val id: Int,
    val firstName: String,
    val name: String,
    var pseudo: String,
    val email: String
) {
    fun seePerson()
    {
        println("$id, $firstName, $name, $pseudo, $email")
    }

    fun sendMessage(message: String)
    {
        val newMessage = Message(this, message,"now")
        newMessage.printMessage()
    }

    fun createConversation(vararg members: Person): Conversation
    {
        var newConversation = Conversation()
    }
}