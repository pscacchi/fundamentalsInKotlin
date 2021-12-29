
/*
* Programming in Kotlin. Fundamentals
* Part 01. Use datatype & operations
*
*  7. Challenge. If expressions & bollean logic
*/

/*
* Check if the user data for registering an account is valid. Data is valid if
*
* 1. Properties are not empty
* 2. Username has at least 6 characters.
* 3. Password has at least 10 characters.
* 4. The email contains a '@' and a '.'.
*
* Hint.: use the 'contains()' function on a String
*
* Use 'if' as an expression, to assign a respective
* error message if any of the cases fail! Then print
* it out.
*
* The messages are prepared for you in the project.
*/

fun main() {
    val username = "Pablos"
    val password = "12345678"
    val email = "pablos@endava.com"

    val message =
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) "You must fill all fields"
        else if (username.length >= 6) "Username is too short"
        else if (password.length >= 10) "Password is too short"
        else if (email.contains("Q") && email.contains(".")) "Email doesn't contains a '@' or a '.'"
        else "Succesfull registration!"

    print(message)

}


