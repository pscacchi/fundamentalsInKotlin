
/*
Programming in Kotlin. Fundamentals
Part 01. Use datatype & operations

2. Use booleans & comparison operators

*/

fun main(arguments: Array<String>) {
    val isProgrammingAwesome = true

    println("Is programming awesome? $isProgrammingAwesome")

    val myAge = 23

    val isLegalDrivingAge = myAge >= 18
    println(isLegalDrivingAge)

    val ageTim = 27
    val isTimOlder = ageTim > myAge
    println(isTimOlder)

    val yearOfBirth = 1996

    val isBornInTwentiethCentury = yearOfBirth < 2000
    println(isBornInTwentiethCentury)

    val strangerName = "Tim"
    val myName = "Filip"

    val isSameName = strangerName == myName // comparison for equality
    println(isSameName)

    val areNamesDifferent = myName != strangerName // comparison for inequality
    println(areNamesDifferent)

    println(!areNamesDifferent) // negation = inverting values = flipping

    // create two separate instance
    val firstObject = Any()
    val secondObject = Any()

    // triple equal operator (===) to check if they point to the same
    // reference or memory addresse
    println(firstObject === secondObject)
    println(firstObject !== secondObject)

    val isNameEmpty = myName.isEmpty()
    println(isNameEmpty)

}


