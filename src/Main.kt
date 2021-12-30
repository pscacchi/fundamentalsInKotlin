
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  23. MCF. Iterate over collections
*/

/*
* EXITING EARLY
*
* Continuing iterations
* Breaking a loops
*
* MULTI-DIMENTIONAL COLLECTIONS
*
*
* NESTED LOOPS
*
* for (row in 0..matrix.lastIndex) {
*   for (column in 0..matrix.lastIndex) {
*   }
* }
*
* LABEL
*
* labels are like checkpoints in code which you can travel.
*
* label@ for (row in 0..matrix.lastIndex) {
* }
*
* MATRIX COMPLEXITY
* Iteration - O(M*N)
* In square matrix (NxN) - (O(N^2))
*
*
* */

fun main() {
    val daysOfWeek = listOf(
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    )

    for (day in daysOfWeek) {
        if (day == "Monday") {
            continue
        }
        println("Working!")
        if (day == "Thursday") {
            println("Get ready for the weekend!")
            break
        }
    }

    val matrix = MutableList<MutableList<String>>(5) { MutableList(5) { "" } }

    for (row in 0..matrix.lastIndex) {
        for (column in 0..matrix.lastIndex) {
            matrix[row][column] = "$row:$column"
        }
    }

    println(matrix)
    println("-----")

    for (row in matrix) {
        println(row)
    }

    val thirdRowFifthColumnElement = matrix[2][4]
    println(thirdRowFifthColumnElement)

    row@ for (row in 0..5) {
        column@ for (column in 0..5) {
            if (column == 2 && row == 2) {
                break@row
            }
            print("x\t")
        }
        println()
    }
}




