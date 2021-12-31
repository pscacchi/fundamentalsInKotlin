/*
* Programming in Kotlin. Fundamentals
* Part 06. Create classes
*
*  45. Model objects using data classes
*/

/*
* DATA CLASSES
*
* all values available
* ability to compare them
* deep comparison and destucturing
* make copy of structure
* immutability => copy
*
* DATA CLASSES
*
* copy()
* toString()
* componentN()
* equals()
* hashCode()
*
* SYNTAX
*
* data class Car(
*       val name: String,
*       val year: Int,
*       val color: String)
* */

data class Person(
    val name: String,
    val lastName: String?,
    val age: Int,
    val pet: Pet)

data class Pet(
    val name: String,
    val animalType: String)


fun main() {
    val dog = Pet("Max", "German Shepard Dog")
    val filip = Person("Filip", "BBabic", 23, dog)

    println(filip)

    val olderFilip = filip.copy(age = filip.age + 20)
    println(olderFilip)

    val (name, _, age, pet) = olderFilip
    println(pet)

    val firstName = olderFilip.component1()
    println(firstName)

    var filipTwo = filip
    println(filipTwo == filip)
    println(filipTwo === filip)

    filipTwo = filip.copy()
    println(filipTwo == filip)
    println(filipTwo === filip)
}





