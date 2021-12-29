
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  11. Combine data in pair&triples
*/

/*
* this can become cumbersome to maintain
* the more value you have
* */
fun main() {
    val fullName = Pair<String, String>("Filip", "Babic")
    val age = 23

    println("My name is ${fullName.first}, ${fullName.second}")

    val (name: String, lastName: String) = fullName
    println("My name is $name, $lastName")

    val birthday = Triple(11,12, 1996)
    val person = Pair(fullName, birthday)

    val nameUsingOrdering = person.first
    val birthdayUsingOrdering = person.second

    val (fname, bday) = person
    val (day, month, _) = bday

    val yearOfBirth = bday.third
    println("$fname was born on $day/$month, year $yearOfBirth")
}


