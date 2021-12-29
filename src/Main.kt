
/*
* Programming in Kotlin. Fundamentals
* Part 01. Use datatype & operations
*
*  9. Challenge. Nullables
*/

/*
* Declare a variable of type String? called 'password'
* and assign a value to it
*
* Using an if expression, check the level of password
* strength, and assign an appropriate message to another
* constant named 'message'. The print out the message.
*
* Levels and messages are predefined and included in the
*  project
* */

fun main() {
    var password: String? = "Pablo"

    val message =
        if (password == null || password.isEmpty()) "Necesitas una clave"
        else if (password.length <= 5) "Clave debil"
        else if (password.length <= 10) "Clave de dureza media"
        else if (password.length <= 15) "Clave fuerte"
        else "Super clave"

    println(message)
}


