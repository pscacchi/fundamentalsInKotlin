
/*
* Programming in Kotlin. Fundamentals
* Part 02. Store Data In Collections
*
*  24. MCF. Challenge. Iterating collections
*/

/*
* Challenge:
*
* Simulate a game where you have to find the X in a matrix
*
* Step 1: Choose the matrix size
* E.g. 3x3
*
* Step 2: Create the matrix
*
* Step 3: Create a nested loop which will fill the matrix with '.'
* symbols for all of the elements, instead of 1 of your choice,
* which will be an 'X' symbol.
*
* Step 4: Find the element, and print out its coordinates. Then
* stop the loop from going further!
* */

fun main() {
    val size = 4

    val matrix = MutableList(size) { MutableList(size) { '.' } }

    val choiceX = 3
    val choiceY = 2

    matrix[choiceX][choiceY] = 'X'

    for (row in 0 until size) {
        for (column in 0 until size) {
            if (matrix[column][row] == 'X') {
                println("$column, $row")
                break
            }
        }
    }
}





