
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  30. Work with maps
*/

/*
* CREATING MAPS
*
* val users = mapOf("ID13" to "Mark")
* val empty = emptyMap<String, String>()
*
* MUTABILITY
* Referential mutability
*   val name = "Filip"
*   name = "Mark" // nope
* InternalM mutability
*   val names = arrayOf("Filip", "Mark")
*   names[0] = "Phillip"
* Content mutability
*   val map = mapOf("Strategy" to
*        mutableListOf("HoMM3", "Civilization VI")
*   ) // map, cannot be changed
*
* map["Strategy"]?.add("Command & Conquer") // contents can be changed
*
* */

fun main() {

    val videoGamesCollection = mutableMapOf<String, MutableList<String>>()
    println(videoGamesCollection)

    videoGamesCollection.put("Action", mutableListOf("Dark Souls", "Sekiro: Shadows Die Twice"))
    println(videoGamesCollection)

    val actionGames = videoGamesCollection["Action"]
    println(actionGames)

    val strategyGames = videoGamesCollection["Strategy"]
    println(strategyGames)

    val authenticationHeaders = mapOf (
        "API_KEY" to "your-api-key",
        "Authorization" to "auth token",
        "content/type" to "application/json"
    )
    println(authenticationHeaders)

    // ---

    videoGamesCollection["Strategy"] = mutableListOf("Heroes of Might & Magic 3")
    println(videoGamesCollection)

    videoGamesCollection["Strategy"]?.add("Civilization VI")
    println(videoGamesCollection)

    val removedActionGames = videoGamesCollection.remove("Action")
    println(removedActionGames)
    println(videoGamesCollection)

    //authenticationHeaders["Authorization"] = "new api key"
    videoGamesCollection["Strategy"]?.add("Command & Conquer")
    videoGamesCollection["Shooter"] = mutableListOf("DOOM")

    for (key in videoGamesCollection.keys) {
        println(key)
    }

    for (value in videoGamesCollection.values) {
        println(value)
    }

    for ((key, value) in videoGamesCollection) {
        println("Video games in the $key genre you own are: $value")

    }
}





