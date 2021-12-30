
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  25. MCF. Simplify Code with when expressions
*/

/*
* WHEN EXPRESSION
* similar switch case
*
* when (value) {
*   expression -> statement
*   expresion2 -> statement2
*   expresion3 -> statement3
*   else -> statemente4
* */

fun main() {
    val myAge = 23

    when (myAge) {
        25 -> println("Quarter century!")
        23 -> println("Close to a quarter century!")
        else -> {
            println("Don't know your age!")
        }
    }

    when (myAge) {
        in 0..12 -> println("Still a young boy!")
        in 13..19 -> println("Teenager")
        in 20..29 -> println("In the twenties")
        in 30..39 -> println("In the thirties")
        in 40..49 -> println("In my forties")
        else -> println("I'm a wise man:]")
    }

    val message = when (myAge) {
        in 0..12 ->"Still a young boy!"
        in 13..19 -> "Teenager"
        in 20..29 -> "In the twenties"
        in 30..39 -> "In the thirties"
        in 40..49 -> "In my forties"
        else -> "I'm a wise man:]"
    }
    println(message)

    val email: String? = "mail@mail.com"
    val password: String? = "iLoveKotlin!"

    when {
        email == null || email.isEmpty() -> println("You need to choose en email!")
        "@" !in email -> println("Your email is invalid!")
        password == null || password.isEmpty() -> println("You nedd to choose a password!")
        password.length < 10 -> println("Password not strong enought!")
        else -> println("Email length: ${email.length}, Password length: ${password.length}")
    }
}





