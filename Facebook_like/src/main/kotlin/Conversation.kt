class Conversation (
    var name: String,
    val listMember: MutableList<Person>,
    val listMessage: MutableList<Message>
) {
    var id: Int? = null //j'en étais la (faire id static puis incrementer en creant)


    fun seeMember()
    {
        println("----- Members of $name ($id) -----")

        for (i in listMember)
        {
            println("- ${i.firstName}, ${i.name}")
        }

        println("---------- end $name -----------")
    }

    fun printConversation()
    {
        if(listMessage.lastIndex != -1)
        {
            println("----- Conversation $name ($id) -----")
            for (i in listMessage)
            {
                i.printMessage()
            }

            println("---------- end $name -----------")
        }
        else
        {
            println("No Message")
        }
    }

    fun addMessage(message: Message)
    {
        listMessage.add(message)
    }
}