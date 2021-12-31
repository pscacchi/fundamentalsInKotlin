/*
* Programming in Kotlin. Fundamentals
* Part 06. Create classes
*
*  46. Challenge. Data class
*/

/*
* CHALLENGE
*
* Change the class from the first
* challenge to be a 'data' class
* instead & make sure the class is immutable.
*
* Create a copy of a certain object
* you created, and compare it for data
* equality and identity (reference equality.
*
* Destructure the object, and use the properties
* to print out its data.
*/


data class ArtWork(
    val name: String,
    val genre: String,
    val length: Int,
    val type: String
) {
    fun getResume() = "$name is a $type del genre $genre with a length of $length seconds"
}

fun main() {
    val movie = ArtWork("Ninja attack", "action", 98 * 60,"movie")
    val song = ArtWork("I fell good", "rock", 210, "song")

    println(movie.getResume())
    println(song.getResume())

    val movieTwo = movie.copy()
    println(movie == movieTwo)
    println(movie === movieTwo)

    val (name, genre, length, type) = movie

    println("$name, $type, $genre, $length")
}






