
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  20. Challenge. While loops
*/

/*
* Challenge 1:
*
* Print number from 1 to 15, using a while loop
*
* Challenge 2:
*
* Create an array or list of names
*
* Using a do-while loop, and an iterator, print the names in a reverse order.
*
* Make sure that the iterator is within the bounds of the array's size. (from lastIndex to 0)
* */

fun main() {
    val visitedCountries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )

    var idx = 1
    while(idx <= 15) {
        println(idx)
        idx += 1
    }

    idx = visitedCountries.size - 1
    do {
        println(visitedCountries[idx])
        idx -= 1
    } while (idx >= 0)

}




