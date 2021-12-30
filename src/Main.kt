
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  29. Create & access maps
*/

/*
* MAP
*
* Collection of Paris
* Also known as Dictionary
* Produce some output, when certain input
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
}





