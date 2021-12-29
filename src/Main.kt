
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  13. Challenger: Pair & triples
*/

/*
* Create a Pair which hold
* information about a Bank Account
* A Bank Account needs to have a
* Credit Card connected to it, and a
* balance. Hint: you can nest a Triple
* in a Pair
*
* A Credit Card should have a Card
* number, security code, and the
* type of card(e.g. "Visa", "MasterCard").
*
* Print out the data for the Account,
* While hiding the security code.
* */
fun main() {
    val firstName = "Pablo"
    val lastName = "Sca"
    val person = Pair(firstName, lastName)

    val creditNumber = 12345678901234
    val securityCode = 1234
    val typeCard = "Visa"

    val creditCard = Triple(creditNumber, securityCode, typeCard)

    val bankAccount = Pair(person, creditCard)

    println("First Name: ${bankAccount.first.first}")
    println("Last Name: ${bankAccount.first.second}")
    println("Credit Number: ${bankAccount.second.first}")
    println("Type of CreditCard: ${bankAccount.second.third}")


}


