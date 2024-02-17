package Loops

fun main() {
    println("Enter a number:")
    val input = readLine()
    val n: Int = input?.toIntOrNull() ?: 0

    println("Using for loop:")
    for (i in 1..n) {
        println(i)
    }

    println("Using while loop:")
    var i = 1
    while (i <= n) {
        println(i)
        i++
    }

    println("Using do-while loop:")
    var j = 1
    do {
        println(j)
        j++
    } while (j <= n)
}
