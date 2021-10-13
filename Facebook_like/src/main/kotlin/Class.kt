class Person (
    val id: Int,
    val firstName: String,
    val name: String,
    var pseudo: String,
    val email: String
    )
{
    fun seePerson(): Unit{
        println("$id,$firstName,$name,$pseudo,$email")
    }
}

class Group (
    val id: Int,
    val name: String,
    val listMember: MutableList<Person>
    )
{
    fun seeGroup(): Unit{
        println("$listMember")
    }

    fun addMember(newMember: Person){
        listMember.add(newMember)
    }
}