fun main() {
    println("Hello World!")

    val jean1 = Person(1,"jean","1","Oui","oui@")
    val jean2 = Person(2,"jean2","2","Oui2","oui2@")
    jean1.seePerson()

    val listgroup1 = mutableListOf<Person>()
    val group1 = Group(1,"le_groupe",listgroup1)
    group1.addMember(jean1)
    group1.addMember(jean2)
    group1.seeGroup()

    jean1.sendMessage("Coucou")

    val listMessageConv1 = mutableListOf<Message>()
    val coucou1 = Message(jean1,"coucou","now")
    val coucou2 = Message(jean2,"coucou","now")

    var conv1 = Conversation(1,"la_conv",listgroup1,listMessageConv1)
    conv1.addMessage(coucou1)
    conv1.addMessage(coucou2)
    conv1.seeMember()
    conv1.printConversation()

    /*var m1: Man? = Man(55,"oui","oui")
    var m2: Man? = m1

    m1 = null
    if(m2 == null){
        println("null")
    }
    else{
        m2.seeHuman()
    }*/
}