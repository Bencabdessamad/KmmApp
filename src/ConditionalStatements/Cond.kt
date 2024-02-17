package ConditionalStatements

fun main() {
    println("Enter a number:")
    val input = readLine()
    val x: Int = input?.toIntOrNull() ?: 0

    if (x > 0) {
        println("Positive")
    } else if (x < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}
