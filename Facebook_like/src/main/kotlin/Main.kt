fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    val jean1 = Person(1,"jean","1","Oui","oui@")
    val jean2 = Person(2,"jean2","2","Oui2","oui2@")
    jean1.seePerson()

    val listgroup1 = mutableListOf<Person>()
    val group1 = Group(1,"le_groupe",listgroup1)
    group1.addMember(jean1)
    group1.addMember(jean2)
    group1.seeGroup()
}