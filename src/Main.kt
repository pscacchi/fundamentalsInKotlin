
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  32. Store unique data in sets
*/

/*
* SET
*
* Math-basep set
* Unique elements
*
* */

fun main() {
    val userIds = setOf("ID1B", "ID2C", "ID3F", "ID8I")
    println(userIds)

    println(userIds.contains("ID3F"))
    println("ID1B" in userIds)

    val mutableIds = userIds.toMutableSet()

    println(mutableIds.add("ID0Z"))
    println(mutableIds)

    println(mutableIds.add("ID1B"))
    println(mutableIds)

    println(mutableIds.remove("ID1B"))

    for (userId in mutableIds) {
        println(userIds)
    }

    val names = arrayOf("Phillip", "Mark", "Brian", "Joe", "Ted", "John", "Phillip")
    println(names)

    val uniqueNames = names.toSet()

    println(uniqueNames)
}





