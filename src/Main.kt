
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  33. Challenge. Set
*/

/*
* CHALLENGE
*
* - Create a list of string, describing items
* on your table. If items appear more than once,
* add them multiple times, like two pens.
*
* - Turn that list into a set, and check if the
* duplicate appear
*
* -Remove an item you don't really need on your desk,
* e.g. car keys
*
* - Iterate over the items, and print them out
*
* */

fun main() {
    val things = listOf("cable", "cable", "pendrive", "pendrive", "phone", "antenna", "batery")

    val thingSet = things.toMutableSet()

    println(thingSet.remove("batery"))

    for (item in thingSet) {
        println(item)
    }
}




