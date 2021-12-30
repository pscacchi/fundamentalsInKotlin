
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  31. Challenge. Maps
*/

/*
* CHALLENGE
*
* Create a map where each key is the name if a pet you have/had,
* and the value is the animal type that pet is.
*
* E.g. Key: "Max", Value: "German Shepard Dog"
*
* Add the value to the map, then remove a value, and finally,
* iterate over the map, printing out the entries.
*
* */

fun main() {
    val petMap = mutableMapOf<String, String>()
    petMap["Max"] = "German Shepard Dog"
    petMap["Night"] = "Pure Dog"

    for ((name, breed) in petMap) {
        println("My pet $name was a $breed.")
    }
}





