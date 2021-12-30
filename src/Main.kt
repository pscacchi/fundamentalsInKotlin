
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  26. MCF. Challenge. When expressions
*/

/*
* CHALLENGE
*
* Use a when expression to return
* which century an arbitrary year is
* from (as a String)
*
* Cover at least the last three
* centuries, and return "This was
* looong ago!" for others
* then prin out the returned value
*
* Use Ranges for year comparison
* */

fun main() {
    val year = 1976

    val century = when (year) {
        in 2000..1999 -> "21th century"
        in 1900..1999 -> "20th century"
        in 1800..1899 -> "19th century"
        else -> "This was looong ago!"
    }
    println(century)
}





