
/*
* Programming in Kotlin. Fundamentals
* Part 01. Use datatype & operations
*
*  4. Challenge: Booleans
*/

/*
* Challenge 1: Check and store in a Boolean if a password is secure
* For simplicity, we can say that a password is secure if has at least 10 characters
*/

/*
* Challenge 2: Check if two people have the same name lengths.
*/

fun main(arguments: Array<String>) {

    // Challenge 1
    val password = "1234567890"
    val isPasswordSecure = password.length >= 10
    println(isPasswordSecure)

    // Challenge 2
    val name = "Pablo"
    val anotherName = "MrBeast"
    val sameLengths = name.length == anotherName.length
    println(sameLengths)


}


