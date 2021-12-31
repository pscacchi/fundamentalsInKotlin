/*
* Programming in Kotlin. Fundamentals
* Part 06. Create classes
*
*  43. Define properties, methods & class mutability
*/

/*
* CLASS CONCEPTS
*
* Encapsulation
*   Is the process when you abstract away information
*   to hide away some key implementation details.
* Mutability
* Composition
*   To expand the behavior of a class with another object
*   Without adding multiple properties or methods
* Reference & values
* */

class Pet(var name: String, val animalType: String)


class Person (
    private val name: String,
    private val lastName: String?,
    private var age: Int,
    val pet: Pet
) {
    fun setAge(age: Int) {
        if (age in 0..150) {
            this.age = age
        } else {
            // invalid age
        }
    }

    fun getAge() = age

    fun getFullInformation(): String {
        return "Full Name: $ lastName, $name, Age: $age, Pet: ${pet.name}, ${pet.animalType}"
    }
}

fun main() {
    var dog = Pet("Jura", "Goldie/Husky/Labrador Mix!")
    val filip = Person("Filip", "Babic", 23, dog)
    println(filip.getFullInformation())

    filip.setAge(75)
    println(filip.getAge())

    dog.name = "Scratchy"

    dog = Pet("Jura", "Goldie")

    println(filip.pet.name)
}





