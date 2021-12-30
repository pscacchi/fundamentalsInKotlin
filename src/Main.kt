
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  21. MCF. Loop using for loops
*/

/*
* FOR LOOPS
*
* Fixed number of iterations
* Uses Ranges
*
*  RANGES
*  1..10 = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
*
* */

fun main() {
    val visitedCountries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )

    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)

    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for (index in rangeFromZeroToTen step 2)  {
        print(index)
    }

    println("")

    for (index in 10 downTo 0) {
        print(index)
    }

    println("")

    for (countryIndex in 0..visitedCountries.size -1) {
        print("${visitedCountries[countryIndex]} ")
    }

    println("")

    for (element in visitedCountries) {
        print("$element ")
    }

    println("")
}




