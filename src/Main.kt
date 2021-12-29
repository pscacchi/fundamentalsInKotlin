
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  16. Challenge: array & lists.
*/

/*
* CHALLENGE:
*
* Create an Array of your five favorite
* games. Any game type.
*
* Change an element within the Array,
* and print out the second game.
* Transform the Array to a List that can
* change its contents, and add two more
* games you'd like to play or finish.
*
* Then remove a game you've played
* most recently.
*
* Finally, print out the list of games
* you end up with!
* */

fun main() {
    val gameArray = arrayOf("Zaxxon", "Bruce Lee", "Beach Head", "Henry's House", "Flight simulator")

    gameArray[0] = "Tetis"
    println(gameArray[1])

    val games = gameArray.toMutableList()
    games.add("Pac-man")
    games.add("Double dragon")

    games.remove("Flight simulator")
    println(games)
}




