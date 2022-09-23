import java.awt.event.ContainerAdapter

class Employee constructor(var name:String, var number:Int, var shift:Int){

    init {
        println("New employee created: $name-$number")
    }

    var contact = Contacts(number, name)

    fun printContactInfo(){
        contact.printAll()
    }
    fun setContactInfo(x:Int = 0, y:String = "Unknown", z:String="Unknown", l:String="Unknown", p:String="Unknown",
                       w:String="Unknown", h:String="Unknown"){
        contact.contactID = x
        contact.firstName = y
        contact.lastName = z
        contact.emailAddress = l
        contact.phoneCell = p
        contact.phoneWork = w
        contact.phoneHome = h
    }
}