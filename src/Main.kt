
/*
* Programming in Kotlin. Fundamentals
* Part 01. Use datatype & operations
*
*  10. Conclusion
*/

/*
* val name = "Filip"
*    var age = 23
*
*    val ageAsString: String = age.toString()
*
*   val nameLongerThanAge = name.length > ageAsString.length
*
*   if (nameLongerThanAge) {
*
*   }
*
*   val firstName = "Filip"
*   val lastName = "Babic"
*
*   val isNameValid =
*               firstName.isNotEmpty() &&
*               lastName.isNotEmpty()
*
*   val message =
*       if (isNameValid) "Your full name is $lastName, $firstName"
*       else "Your name seems to be invalid"
*
*   val nickname: String? = null
*   if (nickname != null) {
*       // smart cast
*   }
*
*   val myNickname = nickname ?: "Filip"
*   val nicknameLength = nickname?.length ?: myNickname.length
* */

/*
* Challenge.
*
* Create several values describing you
* as a person, in piece of data. The
* pieces of data are as follows:
* - Name
* - Last name
* - Nickname (if exists)
* - Country
* - Age
*
* Then find your year of birth using
* your age, and print out your data in
* the format included in the project,
* while following the extra rules
* within the project
*  */

fun main() {

    val name = "Pablo"
    val lastName = "Sca"
    val nickname: String? = null
    val country = "Argentina"
    val age = 45

    val nameToPrint = if (age >= 18) "$name," else ""
    val nicknameToPrint = nickname ?: ""
    val yearOfBirth = 2022 - age

    val userData = "$nameToPrint $nicknameToPrint $lastName, born on $yearOfBirth, in $country"

    println(userData)

}


