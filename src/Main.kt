
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  22. MCF. Challenge. For loops
*/

/*
* Challenge 1:
* Create a range of 20 numbers, and iterate over it, printing out the numbers
*
* Challenge 2:
* Iterate over the range in Challenge 1 again, but print every third number.
*
* Challenge 3:
* Create a decreasing range of 15 numbers, and print every second number.
* */

fun main() {
    val range = 10..30
    for (number in range) {
        print("$number ")
    }
    println()
    for (number in range step 3) {
        print("$number ")
    }
    println()

    val decrRange = 15 downTo 0
    for (number in decrRange step 2) {
        print("$number ")
    }
    println()
}




