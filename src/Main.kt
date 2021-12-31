/*
* Programming in Kotlin. Fundamentals
* Part 06. Create classes
*
*  44. Challenger: Class
*/

/*
* CHALLENGE
*
* Create a class which represents a Movie,
* a Video Game or a Song. Add appropriate
* properties like "name", "genre", "length"
*
* Add methods which format the properties
* in a String for you to print out.
*
* Create a few objects of the class type &
* print out their data.
*
* */

class ArtWork(
    private val name: String,
    private val genre: String,
    private val length: Int,
    private val type: String
) {
    fun getResume() = "$name is a $type del genre $genre with a length of $length seconds"
}

fun main() {
    val movie = ArtWork("Ninja attack", "action", 98 * 60,"movie")
    val song = ArtWork("I fell good", "rock", 210, "song")

    println(movie.getResume())
    println(song.getResume())
}





