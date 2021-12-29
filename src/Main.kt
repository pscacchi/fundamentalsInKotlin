
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  13. Allocate arrays
*/

/*
* Difference in collections
*
* - Memory management
* - Ability to change (Multability)
* - Performance
*   - Accessing data
*   - Adding / removing data
*   - Iterating over values
* */

/*
* ARRAYS
*
* Connected group of values of the same type
* It's like a fixed or a glued series of data of same type, but
* each each data value can be different.
* It's a static collection, because when you create an array,
* you have to allocate the fixed of static chunk o memory. The size
* can not change. (no remove or add)
*
* Big O notation:
*    - instant -> accessing values
*    - linear operation -> grows slower with more elements
*
* */

fun main() {
//    val cauntry1 = "Russia"
//    val country2 = "USA"
//    val country3 = "Poland"

    val visitedCountries = arrayOf<String>(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal",
        "Serbia", "Hungary", "Austria"
    )

    println(visitedCountries)
    println(visitedCountries.size)

    println(visitedCountries[3])

//    println(visitedCountries[20])  // out of bondary
//    println(visitedCountries[-1])  // out of bondary

    visitedCountries + "Belgium"
    println(visitedCountries.size)
    println((visitedCountries + "Belgium").size)

    visitedCountries[1] = "The United States of America"
    println(visitedCountries[1])

    val sizedArray = Array(10) { "" }
    val emptyArray = emptyArray<String>()

    val arrayOfInts = intArrayOf(2, 3, 4, 5, 6, 7)
    println(arrayOfInts)

    val intArray = IntArray(10)
    println(intArray)

    println(visitedCountries.lastIndex)
    println(visitedCountries.last())
    println(visitedCountries.first())

    val currentCountry = "Spain"
    println(visitedCountries.contains(currentCountry))

    val hasVisitedSpain = currentCountry in visitedCountries
    val hasNotVisitedSpain = currentCountry !in visitedCountries

    println(hasVisitedSpain)
    println(hasNotVisitedSpain)


}


