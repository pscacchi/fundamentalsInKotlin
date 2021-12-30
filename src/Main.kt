
/*
* Programming in Kotlin. Fundamentals
* Part 05. Write functions
*
*  38. Challenge: Functions
*/

/*
* CHALLENGE 1
*
* Create a function which takes in
* two parameters - a name and a last name.
*
* Because not everyone has a last name, leave
* the lastName parameter to be a empty String
* if it is not passed in.
*
* Then return how long the person's full name is.
*
* CHALLENGE 2:
*
* Overload the function from the first challenge,
* by adding a list of String parameter, for middle
* names, in case someone has one or more middle names.
*
* Use the function to return the full name length,
* for a name with and without middle names.
*
* Remmember to use named arguments if needed
* */

fun main()  {
    fun getFullNameLength(name: String, lastName: String = "") = (name + lastName).length
    fun getFullNameLength(name: String, middleNames: List<String> = listOf<String>(), lastName: String = "") =
        (name + lastName).length + middleNames.sumOf { it.length }

    var myNameLength = getFullNameLength("Pablo", "Sca")
    println(myNameLength)

    val length = getFullNameLength("Salvador", listOf("Domingo", "Felipe", "Jacinto"), "Dali")
    println(length)

}




