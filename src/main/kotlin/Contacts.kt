class Contacts constructor(var contactID:Int? = 0, var firstName:String? = "Unknown", var lastName:String? = "Unknown",
                           var emailAddress:String? = "Unknown", var phoneHome:String? = "Unknown", var phoneWork:String? = "Unknown",
                           var phoneCell:String? = "Unknown") {

    init {
        println("New Contact Added: $firstName $lastName")
    }

    fun printAll(){
        println("ID: $contactID\n" +
                "First name: $firstName\n" +
                "Last name: $lastName\n" +
                "Email address $emailAddress\n" +
                "Home phone number $phoneHome\n" +
                "Cell phone number $phoneCell\n" +
                "Work phone number $phoneWork")
    }

}