
/*
* Programming in Kotlin. Fundamentals
* Part 01. Use datatype & operations
*
*  5. Combine logical operators
*/

fun main(arguments: Array<String>) {
    val myAge = 12
    val country = "USA"

    val isLegalDriving =
                (country == "Croatia" && myAge >= 18)
                || (country == "USA" && myAge >= 16)
    println(isLegalDriving)

    if (isLegalDriving) {
        println("You can drive")
    } else  {
        println("You've got a bit more time to got")
    }

    if (myAge >= 18) println("I'm an adult") else println("I'm still underaged!")

    val ageMessage = if (myAge >= 18) "I'm an adult" else "I'm still underaged!"
    println(ageMessage)

    println(if (myAge >= 18) "I'm an adult" else "I'm still underaged!")
}


