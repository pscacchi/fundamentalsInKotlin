
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  15. Create lists of data
*/

/*
* powered by Array
* Index data access - O(1)
* Iteration - O(n)
* Dynamic in size: Add [O(1) append at end] & remove [O(n) shift the list]
* */

fun main() {
    val countries = listOf("Russia", "USA", "The Netherlands")

    println(countries)

    val mutableList = countries.toMutableList()

    mutableList.add("Germany")
    mutableList.add(1, "Greece")

    println(mutableList)

    mutableList.addAll(3, listOf("Austria", "Poland", "Hungary"))
    println(mutableList)

    val hasBeenToJapan = "Japan" in mutableList
    println(hasBeenToJapan)

    mutableList.remove("Japan")
    mutableList.removeAt(0)
    mutableList.removeAll(listOf("Russia", "Japan", "USA", "Germany"))

    println(mutableList)

    mutableList[2] = "Croatia"
    val combinedList = countries + mutableList
    val emptyList = emptyList<String>()

    println(mutableList)
    println(combinedList)
    println(emptyList)

    mutableList.clear()
    println(mutableList)
}




