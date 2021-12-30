/*
* Programming in Kotlin. Fundamentals
* Part 05. Write functions
*
*  39. Declare & pass functions
*/

/*
* FUNCTIONS AS TYPE
*
* Functions are type too
* Store functions in variables
* Expect them as parameters in other
*   functions
*
* FUNCTION SINTAX
*
* fun functionName(parameters): ReturnType {
*   body
* }
*
* BASE FUNCTION SIGNATURE
* (parameter)->ReturnType
*
* LAMBDA EXAMPLE
*
* (Int)->Boolean
* */

fun validatePassword(password: String) = password.length >= 10

fun main()  {
    val email: String? = "email@mail.com"
    val password: String? = "password"

    fun validateString(input: String?, inputType: String) =
        if (input == null || input.isBlank()) {
            false
        } else if (inputType == "Password") {
            input.length >= 10
        } else if (inputType == "Email"){
            input.contains("@")
        } else {
            println("Cannot verify this input")
            false
        }

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isBlank()) {
            false
        } else {
            validator(input)
        }

    validateString("Hello World", "Welcome message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

//    val isValidPassword = validateString(password) { input -> input.length >= 10 } // is not a good practice
    val isValidPassword = validateString(password, ::validatePassword)
    println(isValidPassword)

    val passwordValidator = ::validatePassword
    println(passwordValidator)

    val validator: (String?) -> Boolean = { input ->
        input != null && validatePassword(input)
    }

    println(validator)
}




