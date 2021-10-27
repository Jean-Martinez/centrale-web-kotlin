class Group (
    val id: Int,
    val name: String,
    val listMember: MutableList<Person>
) {
    fun seeGroup()
    {
        println("---------- ($id) $name -----------")

        for (i in listMember)
        {
            println("- ${i.firstName}, ${i.name}")
        }

        println("---------- end $name -----------")
    }

    fun addMember(newMember: Person)
    {
        listMember.add(newMember)
    }
}