/*
* Programming in Kotlin. Fundamentals
* Part 06. Create classes
*
*  42. Model & create class
*/

/*
*
*
* */

//class Person {
//    var name: String = ""
//    var lastName: String? = null
//    var age: Int = 0
//}

class Person(val name: String,
             val lastName: String?,
             var age: Int)

class Empty

fun main() {
    val filip = Person("Filip", "Babic", 23)
    println("Name: ${filip.name}, last name: ${filip.lastName}, Age: ${filip.age}")

    val marin = Person("Marin", null, 24)
    println("Name: ${marin.name}, last name: ${marin.lastName}, Age: ${marin.age}")

    val filipClone = filip

    filipClone.age = 24
    println(filip.age)
    println(filipClone.age)

    val filipTwo = Person("Filip", "Babic", 24)

    println(filip == marin)
    println(filip == filipClone)
    println(filip === filipClone)
    println(filipTwo === filip)
}





