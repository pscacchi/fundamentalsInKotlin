
/**
 * This is a documentation-style comment
 * You can reference things here, like [main] function.
 * Yoy can also reference parameters, like the [arguments]
 *
 * @param arguments
 * @author Filip
 *
 * */


fun main(arguments: Array<String>) {
    var myAge: Int = 23
    val name: String = "Filip"
    val lastName = "Babic"
    val weight = 63.5

    println(name)

    println("I'm $myAge years old")

    myAge += 1
    println("I'm $myAge years old")

    println("$name $lastName is $myAge years old, and weighta $weight ks")

    val fullName = "$lastName, $name"
    println(fullName)

    val ageAsString = myAge.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

    // This is line comment

    /*
    * This a multiline comment.
    * You don't have to add // before each line
    *
    *
     */
}


/*
Programming in Kotlin. Fundamentals
Part 01. Use datatype & operations

2. Set-Up IntelliJ IDEA

- DownloadIntelliJ IDEA (Community version)
- Use default setting
- Create main.kt file on source directory (src)
- All Kotlin program need a main function.

*/