
/*
* Programming in Kotlin. Fundamentals
* Part 05. Write functions
*
*  37. Return data from functions
*/

/*
* FUNCTION EXTRAS
*
* Functions as expressions
* Omitting the body
*
* FUNCTION SYNTAX
*
* fun functionName(Parameters): ReturnType {
*   boddy
* }
*
* FUNCTION OVERLOAD
*
*fun printRange(range: Int) {
*  ...
* }
*
* fun printRange(range: CharRange) {
*  ---
* }
* */

fun main()  {
    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) =
        if (isHalfOpen) start until end
        else start..end

    fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if (isHalfOpen) start until end
        else start..end

    fun printRange(range: IntRange) {
        for (number in range) print("$number \t")
        println()
    }
    fun printRange(range: CharRange) {
        for (number in range) print("$number \t")
        println()
    }

    val closedRange = createRange(1, 10)
    printRange(closedRange)

    val halfOpenRange = createRange(1, 10, true)
    printRange(halfOpenRange)

    val usingNamedArguments = createRange(isHalfOpen = true, start = 10, end = 15)
    printRange(usingNamedArguments)

    val charRange = createRange('A', 'Z')
    printRange(charRange)

    fun parseCoordinates(input:String): Pair<Double, Double> {
        val latitudeLongitud = input.split(",")

        val latitude = latitudeLongitud[0].toDouble()
        val longitud = latitudeLongitud[1].toDouble()

        return latitude to longitud
    }

    val (latitude, longitude) = parseCoordinates("45.46,18.68")
    println("The latitude is: $latitude, and the longitude is: $longitude")

}




