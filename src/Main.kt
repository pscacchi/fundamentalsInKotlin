
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  19. Loop using while loops
*/

/*
* LOOPS
*   - while loop
*   - do-while loop
*   - for loop
* Mechanism which allows you turn to run the same piece of code multiple times
* Exit/break condition
* */

fun main() {
    val visitedCountries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )
    var i = 0
    while (i < visitedCountries.size) {
        println("Country at index $i is ${visitedCountries[i]}")
        i += 1
    }

    i = 0
    do {
        println("Country at index $i is ${visitedCountries[i]}")
        i += 1
    } while ( i < visitedCountries.size)
}




